public class ctorStructure {
    public String name;
    public int age;
    public int nos;

    public ctorStructure(String name, int age, int nos){
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

        public ctorStructure (ctorStructure first) {
            this.name = first.name;
        }

    public void status() {
        System.out.println(name + "is fine");
    }

    public int agePhrase () {
        return age;
    }
}
