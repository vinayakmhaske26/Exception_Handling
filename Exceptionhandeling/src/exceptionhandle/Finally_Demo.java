package exceptionhandle;
import java.util.Scanner;
public class Finally_Demo {

	public static void main(String[] args) {
		
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		try {
			System.out.println("Division of two numbers "+num1/num2);
		}
		catch (Exception e) {

			System.out.println("we are not devide any number by zero");
		}
		finally {
			System.out.println("finally block is compulsory excecuted by the try catch block");
		}
	}

}
