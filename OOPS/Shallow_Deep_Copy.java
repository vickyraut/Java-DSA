public class Shallow_Deep_Copy {

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Tony";
        s1.roll_no = 3000;
        s1.marks[0] = 99;
        s1.marks[1] = 98;
        s1.marks[2] = 100;

        Student2 s2 = new Student2(s1);

        // Deep Copy
        for (int i = 0; i<3; i++){
            s1.marks[i] = s2.marks[i];
        }

        // Change in array
        s1.marks[2] = 99;

        System.out.println(s2.name+" "+s2.roll_no);
        for (int j : s2.marks){
            System.out.println(j);
        }

    }

}

class Student2 {
    String name;
    int roll_no;
    int[] marks;

    public Student2() {
        marks = new int[3];
    }


    // Shallow Copy
//    public Student2(Student2 s1) {
//        marks = new int[3];
//
//        this.name = s1.name;
//        this.roll_no = s1.roll_no;
//        this.marks = s1.marks;
//    }


//    Deep Copy
    public Student2(Student2 s1) {
        marks = new int[3];

        this.name = s1.name;
        this.roll_no = s1.roll_no;
    }


}
