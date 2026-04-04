import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = inpu.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        inpu.close();
    }
}