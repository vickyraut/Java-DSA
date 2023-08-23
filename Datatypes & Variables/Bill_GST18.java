import java.util.Scanner;

public class Bill_GST18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost of Pencil");
        float Pencil = sc.nextFloat();

        System.out.println("Enter cost of pen");
        float Pen = sc.nextFloat();

        System.out.println("Enter cost of Eraser");
        float Eraser = sc.nextFloat();

        float Total_Cost = (Pencil + Pen + Eraser) * 0.18f; // 18% is GST, we can also write GST as 0.18f

        System.out.println("Total cost : " + (Pencil + Pen + Eraser));
        System.out.println("Total cost with 18% GST : " + Total_Cost);

        System.out.println();

    }

}
