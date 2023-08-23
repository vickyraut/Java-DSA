import java.util.Scanner;

public class AreaOfCircle {
    static float pie = 3.14f;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Radius");
        float radius = sc.nextFloat();

        double AreaOfCircle = pie * (radius*radius);
        System.out.println("Area of Circle is "+ AreaOfCircle);
    }
}
