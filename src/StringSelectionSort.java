import java.util.Scanner;
public class StringSelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String Value to store:");
		String n=sc.nextLine();
		String []a=new String[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextLine();
		
		}
		int min;
		String temp="";
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[min])<0)
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i] + " ");
		}
	}

}
