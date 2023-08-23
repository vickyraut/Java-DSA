import java.util.Scanner;

public class Half_pyramid_Characters {
    public static void main(String[] args) {
        int Total_Lines;
        char ch = 'A';

        System.out.print("Enter Total number of lines you want : ");
        Scanner sc = new Scanner(System.in);
        Total_Lines = sc.nextInt();

        for (int line = 1; line <= Total_Lines; line++) {
            for (int character = 1; character <= line; character++) {
                System.out.print(ch);
                ch++; // Update characters
            }
            System.out.println();
        }
    }
}
