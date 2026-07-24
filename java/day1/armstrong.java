public class armstrong {

    static boolean armstrong (int num) {
        int count = 0;
        int originalNum = num;

        while (num!=0) {
            int a = num%10;
            int multiply = a*a*a;
            count=multiply+count;
            num = num / 10;
        }

        if (originalNum == count) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main() {
        System.out.println(armstrong(153));
    }
}
