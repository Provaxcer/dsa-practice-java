public class ctorMain {
    static void main() {
        ctorStructure A = new ctorStructure("Sanu", 34,6);

        System.out.println(A.agePhrase());


        ctorStructure B = new ctorStructure(A);

        System.out.println(B.name);
    }
}
