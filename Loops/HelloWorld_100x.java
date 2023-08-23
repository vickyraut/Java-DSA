public class HelloWorld_100x {
    public static void main(String[] args) {
        int counter = 1;

        while(counter <= 100){
            if (counter == 100) {
                System.out.println("100x Hello World");
            } else {

                System.out.println(counter+ " Hello World");
            }
            counter++;
        }
    }
}
