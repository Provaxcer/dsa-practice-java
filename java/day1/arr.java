import java.util.Scanner;

void main() {
    int [] arr = new int[4];

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i<arr.length;i++){
        System.out.print("Type number for " + i + " array: ");
        arr [i] = sc.nextInt();

    }

    for (int newArr : arr) {
        System.out.println(newArr);
    }
}