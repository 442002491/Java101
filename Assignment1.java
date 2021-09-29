// your grade is 3/5
//@ there is no import for scanner ????
// Nawaf alhrbi
// 442002491

//@ set the import first line ( line 9 should be in line 1 )
import java.util.Scanner;
//@ change Main to Assignment1 ( Golden rule class should match the file name )
public class Main
{
	public static void main(String[] args) {
		Scanner my0bj = new Scanner(System.in);
		float num1;
		
		float num2;
		System.out.println("Enter a num");
		num1 =my0bj.nextFloat();
		System.out.println("Enter a num");
		num2 = my0bj.nextFloat();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 % num2);
		System.out.println(num1 / num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 != num2);
		System.out.println(num1 == num2);
	}
}
