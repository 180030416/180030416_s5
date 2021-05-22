package stringsstringbuffer;

public class String6 {

	public static void main(String[] args) {
		String a = "hi";
		String b = "hello";
		String output;

		if (a.length() < b.length()) 
			output = a + b + a;
		else
			output = b + a + b;
		
		System.out.println(output);
	}

}