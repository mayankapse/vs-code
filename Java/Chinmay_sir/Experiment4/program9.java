/* write a program to create a class student with the members student id,name,marks. Create a constructor to initialize the value of 
the members. Input the values using keyboard and display the details of the student using a function display. Display wether the 
student is elligible for the campus interview or not. If the student has marks greater than 60%. */

import java.util.*;

class student {
int stuid ;
String stuname ;
double stumark ;
student(int a , String b , double c ){
stuid = a ;
stuname = b ;
stumark = c ;
}
void display(){
System.out.print("Id = " + stuid);
System.out.print("\nName = " + stuname);
System.out.println("\nMark = " + stumark);
if (stumark >= 60 )
{
System.out.println("You are eligible for campus interview.");
}
else 
{
System.out.println("You are not eligible for campus interview.");}
}
}

public class program9 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the name of the student : ");
String name = sc.nextLine();
System.out.println("Enter the id of the student : ");
int id = sc.nextInt();
System.out.println("Enter the five subjects mark(Out of 100) : ");
int sub1 = sc.nextInt();
int sub2 = sc.nextInt();
int sub3 = sc.nextInt();
int sub4 = sc.nextInt();
int sub5 = sc.nextInt();

double mark = (sub1 + sub2 + sub3 + sub4 + sub5 )/5;

student stu = new student(id,name,mark);
stu.display();
sc.close();
}
}