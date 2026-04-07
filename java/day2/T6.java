import java.util.Scanner;;

public class T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number: ");
        int stored = sc.nextInt();

        int result = 1;

        for (int i = stored; i >= 1; i--) {
            result = result * i;
        }
        sc.close();
        System.out.print(result);
    }

}