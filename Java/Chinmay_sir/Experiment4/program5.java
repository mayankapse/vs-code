/* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 
'Triangle' with constructor having the three sides as its parameters. */

class Triangle{
    int side1, side2, side3;
    Triangle(int s1, int s2, int s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    void area(){
        double s = (side1 + side2 + side3)/2.0;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("Area of triangle : "+area);
    }
    void perimeter(){
        System.out.println("Perimeter of triangle : "+(side1+side2+side3));
    }
}


class program5 {
    public static void main(String[] args) {
       
        Triangle t = new Triangle(3, 4, 5);
        t.area();
        t.perimeter();
    }
}