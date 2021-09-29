// your grade is 3.5/5
//@ there is no import for scanner ????
// Nawaf alhrbi
// 442002491

//
 import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//@check the error ;
		Scanner my0bj = new Scanner(System.in);
		float num1;
		
		float num2;
		System.out.println("Enter a num");
		num1 =my0bj.nextFloat();
		//@check the error;
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
