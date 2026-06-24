import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type BTC Buy Price");
        double buy = sc.nextDouble();

        System.out.println("Type BTC Sell Price");
        double sell = sc.nextDouble();

        double pnl = sell - buy;
        boolean isProfitable = pnl > 0;

        System.out.println("PnL: " + pnl);
        System.out.println("Profitable: " + isProfitable);

        if (pnl > 1000 && isProfitable) {
            System.out.println("Good trade!");
        } else {
            System.out.println("Keep improving.");
        }
    }
}