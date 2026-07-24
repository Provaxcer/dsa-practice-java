public class math {

    static void reverseNum (int num) {
        while (num != 0) {
            int result = num%10;
            System.out.print(result);
            num = num/10;
        }
    }

    public static void main (String[] args) {
        reverseNum(89329);
    }
}
