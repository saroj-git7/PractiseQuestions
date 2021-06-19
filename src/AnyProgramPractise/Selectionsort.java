package AnyProgramPractise;
import java.util.Scanner;
public class Selectionsort {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for selection sorting:");
		int n=sc.nextInt();
		int[] a=new int[10];
		
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		int min;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println("Entered value after selection sorting:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}

}
//there is some bug