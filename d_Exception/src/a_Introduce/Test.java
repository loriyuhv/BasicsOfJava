package a_Introduce;

public class Test {
    public static void main(String[] args) {
        try {
            int num = 6/0;
        }catch(ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Hello Exception!!!");
    }
}
