import java.util.Scanner;

void main() {
    int fact = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Type your number: ");
    int num = sc.nextInt();
    for (int i=0;i<=num;i++) {
        fact = fact +i;
    }
    System.out.println(fact);
    sc.close();
}
