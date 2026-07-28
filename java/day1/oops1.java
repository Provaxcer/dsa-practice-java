public class oops1 {
    public static void main (String[]args) {
        StudentDetails A = new StudentDetails(24,1,"Ramu", 5);
        System.out.println(A.name);
        A.mood();
        A.play();
        StudentDetails B = new StudentDetails(A);

        System.out.println(B.name);
    }
}
