import java.util.Scanner;

public class Question6 {
    public static void main(String args[]) {
        question6();
    }

    public static void question6() {
        int num;
        System.out.println("Enter an integer: ");

        num = new Scanner(System.in).nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        }
        else {
            System.out.println(num + " is an odd number");
        }
    }
}
