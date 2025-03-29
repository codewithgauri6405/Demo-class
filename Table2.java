import java.util.Scanner;
public class Table2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value : ");
        int st = sc.nextInt();
        System.out.println("Enter ending value : ");
        int end = sc.nextInt();
        for(int i = st;i<=end;i++){
            int table;
            for(int j = 1;j<=10;j++){
                table = i*j;
                System.out.println("Table of " + i + " is " + i + " * " +j + " = " + table);
            }
        }

    }
    
}
