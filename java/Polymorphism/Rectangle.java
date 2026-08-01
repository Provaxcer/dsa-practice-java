public class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Rectangle");
    }

    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println(result);
    }
}
