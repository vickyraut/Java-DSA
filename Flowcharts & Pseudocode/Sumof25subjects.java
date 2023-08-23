import java.util.Scanner;

public class Sumof25subjects {

    public static void main(String[] args) {
        int Total_Marks =0;

        for (int sub = 1; sub<=25; sub++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks of "+ sub + " Subject");
            int marks = sc.nextInt();
            Total_Marks = Total_Marks + marks;
        }
        System.out.println("Total marks of 25 subjects are " + Total_Marks);

        int Average = Total_Marks/25;

        System.out.println("Average of total Marks is "+ Average);
    }
}
