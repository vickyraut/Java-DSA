public class Copy_Constructor {

    public static void main(String[] args) {
        Students s1 = new Students("Tony", 3000);

        Students s2 = new Students(s1);
        System.out.println(s2.name + s2.roll_no);
    }

}

class Students {
    String name;
    int roll_no;


    // Parametrized Constructor
    public Students(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    // copy constructor
    public Students(Students s1) {
        this.name = s1.name;
        this.roll_no = s1.roll_no;
    }
}
