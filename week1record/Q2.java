package week1record;

public class Q2 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;

        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);

        System.out.println("Addition = " + (num1 + num2));
        System.out.println("Subtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division = " + (num1 / num2));
        } else {
            System.out.println("Division = Cannot divide by zero");
        }
    }
}

