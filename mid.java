import java.util.Scanner;
public class Mid
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Grade");
	int num = scan.nextInt();
	
	if (num >= 90){
	    System.out.println("A");
	    
	}
	else if (num>=80){
	    System.out.println("Goog job");
	    
	}
	    else if (num >= 60){
	        System.out.println("Passed the course");
	        
	    }
	    else {
	        System.out.println("Sorry you fail or you Entered a wron gred ");
	    }
	}
	
}
