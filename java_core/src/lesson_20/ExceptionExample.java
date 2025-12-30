public class ExceptionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        System.out.println(a/b); // error / by zero
        System.out.println("Some function"); // не сработает

        // Перехват 

        try {
            System.out.println("something");
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
