package exceptionhandle;

import java.util.Scanner;

public class ExceptionhandelingDemo {

	public static void main(String[] args) {

		int num1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		num1=sc.nextInt();
		
		int numArray[]= {1,2,3,4,5};
		try {
			for(int i=0;i<=num1;i++)
			{
				System.out.println(numArray[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
        }
		
		System.out.println("Exception handeling is an art...");
		
	}

}
