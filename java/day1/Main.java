public class Main {

    public static void main(String[] args) {
        int num = 3254234;
        basicMath(num);
    }

    static void basicMath(int num) {
        while (num != 0) {
            int result = num % 10;
            System.out.println(result);
            num = num / 10;
        }
    }
}