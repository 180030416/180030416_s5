
import java.util.Scanner;
public class four {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		if(c1<c2)
		{
			System.out.println(c1+", "+c2);
		}
		else
		{
			System.out.println(c2+", "+c1);
		}
	}
}