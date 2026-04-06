import java.util.Scanner;

public class T5 {

    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scc.nextInt();

        int a = 0, b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        int i = 2;
        while (i < num) {

            int next = a + b;
            a = b;
            b = next;

            System.out.print(next + " ");

            i++;
        }
        scc.close();
    }
}