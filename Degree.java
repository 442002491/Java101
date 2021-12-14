import java.util.Scanner;
class Ex {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        float  n ;
        System.out.println("Enter a number");
        n = scan.nextFloat();
        if(n >= 90 && n <= 100){
            System.out.println("A");

        }
        else if(n >= 80 && n < 90){
            System.out.println("B");
        }
        else if(n >= 70 && n < 80){
            System.out.println("C");
        }
        else if(n >= 60 && n < 70){
            System.out.println("D");
        }
        else if(n >= 0 && n < 60){
            System.out.println("F");
        }
    }

}
