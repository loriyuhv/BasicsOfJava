package Test.test04;

public class Test04 {
    public static void main(String[] args) {
        Integer t;
        t = 66;
        System.out.println(t);
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);

    }
}
