public class palindrome {

    static int reverseNum (int num) {

        int result = 0;
        while (num != 0) {
            result = num%10;
            System.out.print(result);
            num = num/10;
        }
        return result;
    }

    public static void main (String[] args) {
        int num = 1221;


        if (reverseNum(num)==num) {
            System.out.println("It is true");
        }
        else {
            System.out.println("It is false");
        }
    }
}
