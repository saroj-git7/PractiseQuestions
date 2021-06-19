package swaping;
import java.util.Scanner;
public class SwapWithOUTthirdVariable {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a=");
		int a=obj.nextInt();
		System.out.println("Enter the value of b=");
		int b=obj.nextInt();

            //it's time for logic
           a=a+b;
           b=a-b;
           a=a-b;
           System.out.println("The swap value of a is ="+a);
           System.out.println("The swap value of b is ="+b);
           
	}

}
