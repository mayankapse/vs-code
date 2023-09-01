/* Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim'
takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
Length and breadth of rectangle are entered through keyboard. */

import java.util.Scanner;

class Area{
    double l;
    double b;
    void setDim(double p,double q){
        l = p;
        b = q;
    }
    double getArea(){
        double area = l*b;
        return area ;
    }
}
class program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        double length = sc.nextDouble();
        System.out.println("Enter the Breadth : ");
        double breadth = sc.nextDouble();
        Area obj = new Area();
        obj.setDim(length, breadth);
        System.out.println("Area of Rectangle = " + obj.getArea());
        sc.close();
    }
}