public class plidr {

    static int pali(int num) {

        int result = 0;

        while (num !=0) {
            int singleNum = num%10;
            result = result*10+singleNum;
            num = num/10;
        }

        return result;
    }

    static void main() {

        int numberGiven = 12787821;
        int resultLast = pali(numberGiven);

        if (numberGiven== resultLast) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
