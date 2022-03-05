public class student_class3 //Student class with method
class Student3{
    String name ;         //attributes
    int rollno;

    void set(String n, int r)
    {
        name = n ;
        rollno=r;
    }

    void printinfo(){
        System.out.println("This is a student");
        System.out.println("Name of student " + name);
        System.out.println("Roll no of student " + rollno);
    }
}

public class studentClass3 {
    public static void main(String[] args) {
        //creating object of class student
        Student3 s1 = new Student3();
        // s1.set("Raj", 1001) ;
        s1.printinfo();

        Student3 s2 = new Student3();
        s2.set("Simran", 1002) ;
        s2.printinfo();
    }
}

