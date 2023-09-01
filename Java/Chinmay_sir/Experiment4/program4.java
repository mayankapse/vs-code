/* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' 
without any parameter in its constructor. */

class Triangle{
    int a;
    int b;
    int c;
    
    Triangle(){
        a = 3;
        b = 4;
        c = 5;
    }
}

class program4{
public static void main(String[] args) {

    int perimeter;
    Triangle v1 = new Triangle();
    Triangle v2 = new Triangle();
    Triangle v3 = new Triangle();
    int sum = v1.a + v2.b + v3.c;
    int x = v1.a;
    int y = v2.b;
    int z = v3.c;
    perimeter = sum/2;
    System.out.println("Perimeter = "+ perimeter);
    if((x+y)>z && (x+z)>y && (y+z)>x)
    {
      int s=(x+y+z)/2;
      double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
       System.out.println("Area of Triangle : " + area);    
     }
   else  
     System.out.println("Area of Triangle does not exist");
}
}