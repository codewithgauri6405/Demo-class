import java.util.Scanner;
public class Calculator2 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose operation 1.Addition, 2.Subtraction, 3.Multiply, 4.Division, 5.Remainder");
        int n = sc.nextInt();

        switch(n){
            case 1:
            {
               System.out.println("a+b = " + (a+b));
            break;
            }
               case 2:
               {
                System.out.println("a-b = " + (a-b));
                   break;
               }
               case 3:
               {
                System.out.println("a*b = " + (a*b));
                  break;
               }
               case 4:
               {
                System.out.println("a/b = " + (a/b));
                break;

               }
               case 5:
               {
                System.out.println("a%b = " + (a%b));
                break;

               }
            }
            sc.close();
        }

    }
    

