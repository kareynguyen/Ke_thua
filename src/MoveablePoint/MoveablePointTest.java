package MoveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(1.1f, 1.2f);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(1.0f, 1.0f, 1.3f, 1.4f);
        System.out.println(moveablePoint.move());
    }

}
