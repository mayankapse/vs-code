/* Design a class named circle. Construct 3 circle objects with radius 2.0,12 & 24 and display the radius and area of each. A no-arg 
constructor set default value of radius to 1. A getArea() function is used to return the area of circle. Now emplement the class. */

class circle{
    double r ;
    circle(){
        r=1;
    }
    circle (double n){
        r=n;
    }
    double getArea(){
        return(3.14*r*r);
    }
}

class program8{
    public static void main(String arg[]){
        circle c = new circle();
        circle c1 = new circle(2.0);
        circle c2 = new circle(12);
        circle c3 = new circle(24);
        System.out.println("R="+c.r+"A= "+c.getArea());
        System.out.println("R1="+c1.r+"A1= "+c1.getArea());
        System.out.println("R2="+c2.r+"A2= "+c2.getArea());
        System.out.println("R3="+c3.r+"A3= "+c3.getArea());
    }
}