import java.util.Scanner;

public class Break_Statement {
    public static void main(String[] args) {
        int Number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter Your Nuber: ");
            Number = sc.nextInt();

            if (Number%10==0){
                break;
            }

            System.out.println("Your Number was: "+Number);
        }while (true);
    }
}
