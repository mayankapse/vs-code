/* Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and 
that of name as "John" by creating an object of the class Student. */

class Student{
    int roll_no;
    String name;
    int a=2;

    Student(){
        roll_no = a;
        name = "John";
    }
    String name(){
        return name;
    }
    int roll_no(){
        return roll_no;
    }
}

class program2{
public static void main(String[] args) {
    Student s = new Student();
    System.out.println("Name = "+ s.name());
    System.out.println("Roll No = "+ s.roll_no());
    }
}