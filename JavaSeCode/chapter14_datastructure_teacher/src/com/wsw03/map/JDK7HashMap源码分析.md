# JDK7HashMap源码分析

## 1. 实例化过程

```java
HashMap<String, Integer> map = new HashMap<>(16, 0.75);
```

**源码**

```java
// HashMap.java
public HashMap(int initialCapacity, float loadFactor) {
    // ...略...

    // Find a power of 2 >= initialCapacity
    // 通过此循环，得到的capacity的最终值，此最终值决定了Entry数组长度。此时的capacity一定是2的整数倍。
    int capacity = 1;
    while (capacity < initialCapacity)
        capacity <<= 1;

    // 确定了加载因子的值
    this.loadFactor = loadFactor; 

    // 确定了临界值（阙值）
    threshold = (int)(capacity * loadFactor);	
    
    //初始化数组，长度为capacity
    table = new Entry[capacity]; 
    
    // ...略...
}
```

**其中**

```java
// The default initial capacity - MUST be a power of two. 默认初始化容量 - 必须是2的次方
static final int DEFAULT_INITIAL_CAPACITY = 16;
// The load factor used when none specified in constructor. 当在构造器中没有被指定时，就使用加载因子。
static final float DEFAULT_LOAD_FACTOR = 0.75f;

// The load factor for the hash table.
final float loadFactor; // 加载因子

// The next size value at which to resize (capacity * load factor).
int threshold; // 阙值，临界值

//The table, resized as necessary. Length MUST Always be a power of two. 根据需要调整table, 长度必须是2的次方。
transient Entry[] table; // 存储数组的数组
```



## 2. 添加元素

```java
map.put("AA", 78);
```

**源码**

```java
public V put(K key, V value) {
    // HashMap允许添加key为null的值。将此(key, value)存放到table索引0的位置
    if (key == null)
        return putForNullKey(value);
    
    // 将key的哈希值1传入hash()， 此方法执行结束后，返回哈希值2
    int hash = hash(key.hashCode());
    
    // 确定当前key，value在数组中的存放位置i
    int i = indexFor(hash, table.length);
    
    for (Entry<K,V> e = table[i]; e != null; e = e.next) {
        Object k;
        if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
            V oldValue = e.value;
            e.value = value;
            e.recordAccess(this);
            return oldValue; // 如果put是修改操作，会返回原有旧的value值
        }
    }
	
    // ...略...
    
    addEntry(hash, key, value, i); // 将key, value封装为一个Entry对象，并将此对象保存在索引 i 位置。
    return null; // 如果put是添加操作，会返回null。
}

```

**其中**

```java
/**传入哈希值1，返回哈希值2*/
static int hash(int h) {
    // This function ensures that hashCodes that differ only by
    // constant multiples at each bit position have a bounded
    // number of collisions (approximately 8 at default load factor).
    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
}

/** Returns index for hash code h. 返回索引*/
static int indexFor(int h, int length) {
    return h & (length-1);
}

/** Adds a new entry with the specified key, value and hash code to the specified bucket. It is the responsibility of this method to resize the table if appropriate. Subclass overrides this to alter the behavior of put method. 添加一个元素（entry）*/
void addEntry(int hash, K key, V value, int bucketIndex) {
    Entry<K,V> e = table[bucketIndex];
    table[bucketIndex] = new Entry<>(hash, key, value, e);
    // 扩容的条件
    if (size++ >= threshold)
        resize(2 * table.length); // 默认扩容为原有容量的2倍
}
```



## 3. Entry的定义如下

```java
static class Entry<K,V> implements Map.Entry<K,V> {
    final K key;
    V value;
    Entry<K,V> next;
    final int hash;	// 使用key得到的哈希值2进行赋值。

    // Creates new entry.
    Entry(int h, K k, V v, Entry<K,V> n) {
        value = v;
        next = n;
        key = k;
        hash = h;
    }
}
```