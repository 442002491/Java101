import java.util.Scanner;
public class Q1.java{
public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
 float num;
 System.out.println("Enter a num");
 num = scan.nextFloat();
 if (num < 0) {
System.out.println(num + 1);
 }
 else if (num > 0) {
 System.out.println(num - 1); }
 else  {
 System.out.println("0");
             }
         }
     }
