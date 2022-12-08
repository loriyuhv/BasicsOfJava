package d_Method.b_Overload.z_Exercises.Exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        Exercise01 e = new Exercise01();
        e.mOL(3);
        e.mOL(3, 4);
        e.mOL("王师维真帅！！！");

        System.out.println(e.max(3, 2));
        System.out.println(e.max(0.1, 0.2));
        System.out.println(e.max(0.1, 0.1, 0.1));

    }

    public void mOL(int a) {
        System.out.println(a*a);
    }
    public void mOL(int a, int b) {
        System.out.println(a*b);
    }
    public void mOL(String str) {
        System.out.println(str);
    }

    public int max(int a, int b) {
        return a = a > b ? a : b;
    }
    public double max(double a, double b) {
        return a = a > b ? a : b;
    }
    public double max(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
}
