package trickyQuestions;

public class StringConfuse1 {

	public static void main(String[] args) {
		String s1="Random";
		String s2="RANdom";
		System.out.println(s1==s2);
		if(s1==s2)
	{
			System.out.println("True it allocate same memory in cache:");
	}	
else
		{

		
		System.out.println("False it doesnot allocate same memory in cache");
		}
	}

}
