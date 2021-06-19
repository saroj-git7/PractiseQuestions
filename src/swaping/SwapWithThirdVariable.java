package swaping;
import java.util.Scanner;
public class SwapWithThirdVariable {

	public static void main(String[] args) {
	     int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value:");
		 a=sc.nextInt();
        System.out.println("Enter the b value :");
         b=sc.nextInt();
         
         //tHIS IS USING THIRD VARIABLE BUT IN INTERVIEW YOU ALSO HAVE TO USE WITHOUT USING THIRD VARIABLE
        t=a;
        a=b;
        b=t;
      
        
       System.out.println("The swaping value of a is="+a);
       System.out.println("The swaping value of b is="+b);
	}

}
