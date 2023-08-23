import java.util.Scanner;

public class Continue_Statement {
    public static void main(String[] args) {
        int Number;
        Scanner sc =new Scanner(System.in);

        do{
            System.out.print("Enter Your Nuber: ");
            Number = sc.nextInt();

            if (Number%10==0){
                continue;
            }

            System.out.println("Your Number was: "+Number);

        }while (true);
    }
}
