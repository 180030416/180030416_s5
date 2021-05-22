
import java.util.Scanner;
public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c1 = sc.next().charAt(0);
		if((c1>=65 && c1<=90)||(c1>=97 && c1<=122))
		{
			System.out.println("Alphabet");
		}
		else if((c1>=48 && c1<=57))
		{
			System.out.println("Number");
		}
		else
		{
			System.out.println("Special charecter");
		}
			

	}
}