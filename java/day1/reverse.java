import java.util.Scanner;
public class reverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int singleNum = num%10;
            System.out.print(singleNum);
            num = num/10;
        }
    }
}
