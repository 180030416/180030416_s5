
import java.util.*;
public class Primecheck {
	public static void main(String args[])
	{
		System.out.println("Please enter an integer number ");
		int num,c=1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num==0)
			c=0;
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    
	    if(c==0)
	    	System.out.println("0 is neither prime nor composite.");
	    else if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
		
		sc.close();
	}

}