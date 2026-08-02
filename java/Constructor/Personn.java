public class Personn {
    String namee;
    int age;
    int nos;

    Personn(String namee, int age, int nos) {
        this.namee = namee;
        this.age = age;
        this.nos = nos;
    }

    void getDetails() {
        System.out.println("The person, "+namee+" is "+age+" years old");
    }
}
