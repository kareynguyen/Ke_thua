package Shape;

public class CircleTest {
    public void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(2.5, "blue", false);
        System.out.println(circle);
    }
}
