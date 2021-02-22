package Shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(1.3, 3.5);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.6, "orange", false);
        System.out.println(rectangle);
    }
}
