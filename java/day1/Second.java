import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner scannnn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scannnn.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + (i * n));
        }
        scannnn.close();
    }
}
