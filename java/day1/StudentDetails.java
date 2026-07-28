public class StudentDetails {
    int agee;
    int idd;
    String name;
    int nos;

    public StudentDetails (int age, int id, String name, int nos) {
        this.agee=age;
        this.idd=id;
        this.name=name;
        this.nos=nos;
    }

    public StudentDetails(StudentDetails std) {
        this.agee = std.agee;
        this.name = std.name;
    }

    public void mood () {
        System.out.println(name + " is in Good Mood");
    }

    public void play(){
        System.out.println(name + " is playing soccer at the age of "+agee);
    }
}
