public class Task1 {

    static String Name(String a) {
        return "Pair: " + a;
    }

    static String Name(String a, int b) {
        return "Pair: " + a + "Entry Price: " + b;
    }

    static String Name(String a, int b, int c) {
        return "Pair: " + a + "Entry Price: " + b + "Exit Price: " + c;
    }
    
    public static void main(String[] args) {
        System.out.println(Name("BTC", 65000));
    }    
}
