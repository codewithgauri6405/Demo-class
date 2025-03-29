import java.util.Scanner;
public class Table {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
         for(int i = 1;i<=10;i++)
         {
             int table = n*i;
             System.out.println(table);

         }
        
        sc.close();

    }
    
}
