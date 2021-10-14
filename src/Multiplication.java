import java.util.Scanner;

public class Multiplication {
    public static void main () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to process");
        int n = sc.nextInt();

        double product = 1.0;
        double i;
        for (i = 1; i <= n; i++) {
            System.out.println("Please enter a value");
            product *= sc.nextDouble();
        }

        String input = sc.nextLine();


        System.out.println("The final product is " + product);
    }
}