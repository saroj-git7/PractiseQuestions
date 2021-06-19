package trickyQuestions;
public class StringConfuse2 {
	public static void main(String[] args) {
	
		String s="Random";
		String s1="RANdom";
	//	System.out.println(s=s1);//This means this swipe the value of s in s1;it doesnot 
		                          //allocate the same memory thats why it is saying that it is
		                          //s=s1=Random=RANdom;
		//but when we use (==)its mean that the memory allocation is same thats why when 
		//we print i.e
		System.out.println(s==s1);
		//it return false becoz Random and RANdom is not same thats why it does not locate same 
		//memory:and return false:
		
	}

}
