import java.util.Scanner;
public class Calculator {
    public static void main(String[]args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number : ");
         int num1 = sc.nextInt();
         System.out.println("Enter second number : ");
         int num2 = sc.nextInt();
         System.out.println("Choose an operation(+, -, *, /, %) : ");
         char n = sc.next().charAt(0);
         switch(n)
         {
            case '+':
            {
                int Addition = num1 + num2;
                System.out.println( "Addition : "  + Addition );
                break;

            }
            case '-':
            {
                int Subtraction = num1 - num2;
                System.out.println(  "Subtraction : " +  Subtraction);
                break;
            }
            case '*':
            {
                int Multiplication = num1 * num2;
                System.out.println( "Multiplication: " + Multiplication );
                break;
            }
            case '/':
            {
               int Division = num1 / num2;
                System.out.println( "Division : " + Division );
                break;
            }
            case '%':
            {
                int Remainder = num1 % num2;
                System.out.println( "Remainder : "+ Remainder );
                break;
            }
         }       
         sc.close();
    }
}
//Pushing code 
//demo class