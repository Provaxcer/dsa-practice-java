public class method1 {
    static int x =24;
    static void updateValue (int x){

        System.out.println("First int is: " + x);
    }

    public static void main (String[] args){
        System.out.println(x);
        updateValue(30);
    }
}