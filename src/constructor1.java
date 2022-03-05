class Student4
{
    private int rollno;         //private
    private String name;        //private

    Student4(int r, String n){     //constructor
        System.out.println("constructor created ....!!!");
        rollno = r;
        name = n;
    }

    public void displayinfo (){
        System.out.println("rollno " + rollno);
        System.out.println("name :" + name);
    }
}

public class constructor1 {
    public static void main(String[] args) {
        Student4 s1 = new Student4(1, "Raj");       //invoked constructor or called
        s1.displayinfo();

        Student4 s2 = new Student4(2, "Simran");       //invoked constructor or called
        s2.displayinfo();
    }
}