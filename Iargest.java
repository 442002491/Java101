import java.util.Scanner;
public class Iargest.java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nono1;
        float nono2;
        float nono3;
        float nono4;
        System.out.println("Enter Number1");
        nono1 = scan.nextFloat();
        System.out.println("Enter Number2");
        nono2 = scan.nextInt();
        System.out.println("Enter Number3");
        nono3 = scan.nextFloat();
        System.out.println("Enter Number4");
        nono4 = scan.nextFloat();

        if(nono1>nono2 && nono1>nono3 && nono1>nono4){
            System.out.println("The largest score is" + nono1);
        }
        else if(nono2>nono1 && nono2>nono3 && nono2>nono4){
            System.out.println("The largest score is  " + nono2);
        }
        else if(nono3>nono1 && nono3>nono2 && nono3>nono4){
            System.out.println("The largest score is"+nono3);
        }
        else if(nono4>nono1 && nono4>nono2 && nono4>nono3){
            System.out.println("The largest score is"+nono4);
        }

        }
