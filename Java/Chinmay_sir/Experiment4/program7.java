/* Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as 
parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of 
rectangle are entered through keyboard. */

import java.util.*;

class Area{
    double length ;
    double breadth ;
    Area(double a , double b ){
        length = a;
        breadth = b;
    }
    double returnArea() {
        return length * breadth ;
    }
}
public class program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length of rectangle = ");
        double leng = sc.nextDouble();
        System.out.println("Enter breadth of rectangle = ");
        double bredth = sc.nextDouble();
        Area obj = new Area(leng, bredth);
        System.out.println("Area of the rectangle = " + obj.returnArea());
        sc.close();
    }
}