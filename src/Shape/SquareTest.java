package Shape;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.5);
        System.out.println(square);

        square = new Square(4.6, "grey", false);
        System.out.println(square);
    }
}
