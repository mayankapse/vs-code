/* Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating 
two objects of class 'Student'. */

class Student1{
    int roll_no;
    int ph_no;
    String name;
    int a=1;
    String Add;
    Student1(){
        roll_no = a;
        name = "Sam";
        ph_no = 1234;
        Add = "Kolhapur";
    }
    String Name(){
        return name;
    }
    int Roll(){
        return roll_no;
    }
    int Phone_Number(){
        return ph_no;
    }
    String Add(){
        return Add;
    }
} 

class Student2{
    int ph_no;
    int roll_no;
    String name;
    int a=2;
    String Add;
    Student2(){
        roll_no = a;
        name = "John";
        ph_no = 5678;
        Add = "Pune";
    }
    String Name(){
        return name;
    }
    int Roll(){
        return roll_no;
    }
    int Phone_Number(){
        return ph_no;
    }
    String Add(){
        return Add;
    }
} 

class program3{
public static void main(String[] args) {
    Student1 s1 = new Student1();
    Student2 s2 = new Student2();
    System.out.println("Name = "+ s1.Name());
    System.out.println("Roll No = "+ s1.Roll());
    System.out.println("Phone No = "+ s1.Phone_Number());
    System.out.println("Adress = "+ s1.Add());
    System.out.println("");
    System.out.println("Name = "+ s2.Name());
    System.out.println("Roll No = "+ s2.Roll());
    System.out.println("Phone No = "+ s2.Phone_Number());
    System.out.println("Adress = "+ s2.Add());
}
}