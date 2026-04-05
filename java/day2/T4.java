import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int fin = scc.nextInt();

        if (fin % 2 == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Non Prime");
        }
        scc.close();
    }

}