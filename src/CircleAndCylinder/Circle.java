package CircleAndCylinder;

public class Circle {
    private String color = "purple";
    public double radius = 1.2;

    public Circle() {
    }
    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius){
        return radius*radius* Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with color " +
                getColor() +
                " and radius = " +
                getRadius();
    }

}
