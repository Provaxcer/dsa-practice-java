import java.util.Scanner;

public class primeTo {

    static int primeChecker(int num) {

        int count = 0;

        for (int i = 1; i<=num;i++){
            if (num%i==0){
                count++;
            }
        }

        if (count == 2) {
            return num;
        }
        return -1;
    }

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Type Number: ");
        int userInput = sc.nextInt();
        for (int i=3;i<=userInput;i++){
            int finalResult = primeChecker(i);
            if (finalResult==-1){
                continue;
            }
            System.out.println(finalResult);
        }
    }
}
