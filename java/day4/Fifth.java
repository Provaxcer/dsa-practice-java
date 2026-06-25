public class Fifth {

    static String describe(String name) {
        return "Name: " + name;
    }

    static String describe(String name, int age) {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        System.out.println(describe("Santanu"));
        System.out.println(describe("Santanu", 20));
    }
}