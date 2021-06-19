
public class Program {
 
	public void add(int a,int b)
	{
		int z=a+b;
		int x=a-b;
		int i=a*b;
		int s=a/b;
		System.out.println("The multiplication of "+a+"and"+b+ " is ="+i);
		
		System.out.println("The division of "+a+"and"+b+ " is ="+a/b);
		
		System.out.println("The substraction of" +a+"and"+b+ " is="+ x);
		
		System.out.println("The summation of" +a+"and"+b+" is ="+z);
	}
	public static void main(String[] args) {
		
Program p=new Program();
p.add(5, 7);
System.out.println();
p.add(66, 8);
System.out.println();
p.add(67,77);
	}

}
