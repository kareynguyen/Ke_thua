package Triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        double side1, side2, side3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        side1 = sc.nextDouble();
        System.out.println("Enter side 2: ");
        side2 = sc.nextDouble();
        System.out.println("Enter side 3: ");
        side3 = sc.nextDouble();

            if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)){
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("This is a triangle with area is " + triangle.getArea() +
                        " and perimeter is " + triangle.getPerimeter());
            }else {
                System.out.println("This is not a triangle");
            }
        }
    }

