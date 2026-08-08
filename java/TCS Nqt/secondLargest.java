import java.util.Scanner;
import java.util.Arrays;

public class secondLargest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type number of elements");
        int arrInput = sc.nextInt();

        int [] arr = new int [arrInput];

        for (int i = 0; i<arr.length;i++){

            System.out.println("Type number for this index "+ i);
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }
}
