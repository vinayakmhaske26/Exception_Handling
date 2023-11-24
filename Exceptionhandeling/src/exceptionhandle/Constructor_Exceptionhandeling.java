package exceptionhandle;

	class excep{
		
		 void show(){
			 try {
			System.out.println(10/0);
			 }catch (Exception e) {
				 System.out.println(e);
			}
			System.out.println("In Parent class");
		}
		
	}
	class excep1 extends excep{
		
		 void show() {
			System.out.println("In parent class");
		}
	}
	public class Constructor_Exceptionhandeling {
		
	public static void main(String[] args) {
		
		excep e=new excep();
		excep1 e1 = new excep1();
		e.show();
		e1.show();
		
		
		
		
	}

}
