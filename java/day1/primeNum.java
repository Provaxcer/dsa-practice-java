import java.util.Scanner;
public class primeNum {

    public static void main (String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number: ");

        int num = sc.nextInt();

        for (int i=1;i<=num; i++){
            if (num%i==0){
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
