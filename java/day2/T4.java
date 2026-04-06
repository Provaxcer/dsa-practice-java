import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = scc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("prime");
        } else {
            System.out.println("Not Prime");
        }


        scc.close();
    }

}