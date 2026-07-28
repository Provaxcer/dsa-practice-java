public class StudentDetails {
    int age;
    int id;
    String name;
    int nos;

    public StudentDetails (int age, int id, String name, int nos) {
        this.age=age;
        this.id=id;
        this.name=name;
        this.nos=nos;
    }

    public void mood () {
        System.out.println(name + " is in Good Mood");
    }

    public void play(){
        System.out.println(name + " is playing soccer at the age of "+age);
    }
}
