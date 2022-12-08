package d_Method.b_Overload.z_Test.Test01;

public class Test01 {
    public void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    public void swap(int[] a) {
        int t = a[0];
        a[0] = a[1];
        a[1] = t;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Test01 t = new Test01();
        // 基本数据类型值传递交换
        t.swap(a, b);
        System.out.println(a + " " +  b);
        // 引用数据类型交换
        int[] arr = new int[]{a, b};
        t.swap(arr);
        System.out.println(arr[0] + " " + arr[1]);

    }
}
