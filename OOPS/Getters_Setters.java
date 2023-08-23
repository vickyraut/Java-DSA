// Creating Class
class Pen1 {
    private String colour = "blue";

    //Getter
    String getColour() {
        return this.colour;
    }

    // Setter
    void setColour(String newCol) {
        this.colour = newCol;
    }

}


public class Getters_Setters {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();

        System.out.println(p1.getColour());
        p1.setColour("Yellow");
        System.out.println(p1.getColour());
    }
}
