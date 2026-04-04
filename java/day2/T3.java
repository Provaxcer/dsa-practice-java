import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int inp = -1;

        while (inp != 0) {
            System.out.print("Enter a number: ");
            inp = sca.nextInt();

            if (inp != 0) {
                System.out.println("You entered: " + inp);
            }

            else {
                System.out.println("You entered 0. Stopped!");
            }
        }

        
        sca.close();
    }
}