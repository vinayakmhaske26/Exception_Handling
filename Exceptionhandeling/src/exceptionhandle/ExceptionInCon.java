package exceptionhandle;

import java.io.FileReader;

public class ExceptionInCon {
	
	public ExceptionInCon(){
		
		System.out.println("file not found exception");
		try {
		FileReader f=new FileReader("abc.txt");
		}
		catch (Exception e) {

			System.out.println(e);
		}
		
		System.out.println("the exception are in constructor");
		/*try {
			System.out.println(10/0);
		}
		catch (Exception e) {

			System.out.println(e);
		}
		System.out.println("In Constructor........");*/
		
	}

	public static void main(String[] args) {

		ExceptionInCon exp=new ExceptionInCon();
	}

}
