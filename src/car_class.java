
class car {
    private String name;
    private String model;
    private int num;

    car(int i, String m, String n) {
        name = n;
        model = m;
        num = i;
    }

    void display() {
        System.out.println("Car number: " + num);
        System.out.println("Car model: " + model);
        System.out.println("Car name: " + name);
    }
}

public class car_class {
    public static void main(String[] args) {
        car c = new car(1001, "M-1", "XYZ");
        c.display();
    }
}
