//superclass or parent class
class Person {

    public  void talk() {
        System.out.println("i am able to talk ");
    }
}

//subclass
class Student2 extends Person
{
    public void study(){
        System.out.println("i am student, i like to study ");
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.talk();
        s1.study();
    }
}