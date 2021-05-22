
import java.util.Scanner;
public class six {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		String gender=sc.next();
		if((age>=1 && age<=58) &&(gender.equals("Female")))
		{
			System.out.println("percentage of interest is 8.2%.");
		}
		else if((age>=59 && age<=100) &&(gender.equals("Female")))
		{
			System.out.println("percentage of interest is 9.2%.");
		}
		else if((age>=1 && age<=58) &&(gender.equals("Male")))
		{
			System.out.println("percentage of interest is 8.4%.");
		}
		else if((age>=59 && age<=100) &&(gender.equals("Male")))
		{
			System.out.println("percentage of interest is 10.5%.");
		}
		
	}
}