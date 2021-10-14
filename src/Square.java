import java.util.Scanner;

public class Square {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter an integer number: ");
        num = sc.nextInt();
        sc.nextLine();

        System.out.println("Square of " + num + " is: " + Math.pow(num, 2));
    }
}