package exceptionhandle;


	 class p{
	
		final void show() {
			try {
			System.out.println(10/0);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("number is divisible");
		}
	 }
		public class exception_Final {
			
	public static void main(String[] args) {
		
		p p1=new p();
		p1.show();
		}
}

