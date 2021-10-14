import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        Main.everything();
    }

    public static void everything() {
        char operator;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Operator ( +, -, *, /)");
        operator = input.next().charAt(0);



        switch (operator) {
            case '+':
                Addition.main();

                break;

            case '-':
                Normal.main();

                break;

            case '*':
                Multiplication.main();
//
                break;

            case '/':
                Square.main();

                break;

            default:
                System.out.printf("%c is an invalid operator", operator);


        }
    }
}
