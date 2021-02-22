package CircleAndCylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
    }
    public Cylinder(String color, double radius, double height){
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume(){
        return Math.PI*radius*radius*height;
    }

    @Override
    public String toString() {
        return "A cylinder with height is "+
                getHeight()+
                " which is subclass of " +
                super.toString();
    }
}
