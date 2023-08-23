public class Constructor {
    public static void main(String[] args) {
        demo_constructor d_c = new demo_constructor();
        demo_constructor d_c2 = new demo_constructor("Tony Stark");
        demo_constructor d_c3 = new demo_constructor(3000);
    }
}

class demo_constructor {
    String name;
    int roll_no;

    public demo_constructor() {
        System.out.println("I am Empty Constructor");
    }

    // Parametrized Constructor
    public demo_constructor(String name) {
        this.name = name;
        System.out.println(name);
    }

    // Parametrized Constructor
    public demo_constructor(int roll_no) {
        this.roll_no = roll_no;
        System.out.println(roll_no);
    }

}
