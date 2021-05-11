package student.java;
	import java.util.Scanner;
	public class Eight {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			char c1 = sc.next().charAt(0);
			switch(c1) {
			case('R'):
				System.out.println("Red");
			  break;
			case('G'):
				System.out.println("Green");
			  break;
			case('B'):
				System.out.println("Blue");
			  break;
			case('O'):
				System.out.println("Orange");
			  break;
			case('Y'):
				System.out.println("Yellow");
			  break;
			case('W'):
				System.out.println("White");
			  break; 
			  default:
				  System.out.println("Invalid code");
			}
				

		}

	}


