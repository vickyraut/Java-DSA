// Creating Class
class Pen{
    String colour;
    int tip;

    // Function for Object
    void setColour(String newCol){
        colour = newCol;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}


public class Class_Objects {
    public static void main(String[] args) {
        //Initialisation of class
        Pen p1 = new Pen();
        p1.setColour("Yellow");
        p1.setTip(12);
        System.out.println(p1.colour);
        System.out.println(p1.tip);
        p1.colour = "blue";
        System.out.println(p1.colour);
    }
}
