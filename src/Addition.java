import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to process");
        int n = sc.nextInt();

        double Sum = 1.0;
        double i;
        for (i = 1; i <= n; i++) {
            System.out.println("Please enter a value");
            Sum += sc.nextDouble();
        }
        System.out.println("The final answer is " + Sum);
    }
}