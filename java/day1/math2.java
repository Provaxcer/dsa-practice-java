public class math2 {

    static void result (int a , int b) {
        //GCD(a,b) - GCD(b,a%b)
        while (b!=0){
            int oldValueA = a;
            a = b;
            b = oldValueA%b;
        }
        System.out.println(a);
    }

    public static void main (String[] args){
            result(18,12);
    }
}
