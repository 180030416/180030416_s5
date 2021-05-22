
import java.util.*;
public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
			System.out.println(n+" is positive");
		else if(n<0)
			System.out.println(n+" is negative");
		else
			System.out.println("Given number is 0");
		
		sc.close();

	}

}