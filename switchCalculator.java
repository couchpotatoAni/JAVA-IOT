import java.util.Scanner;
public class switchCalculator {
    public static void main(String[] args){
        double num1,num2,result=0;
        char operator;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program if division by zero occurs
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; // Exit the program if an invalid operator is entered
        }

        // Print the final result
        System.out.println("The final result: " + num1 + " " + operator + " " + num2 + " = " + result);

        sc.close();
    }
}
