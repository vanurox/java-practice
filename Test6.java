public class Test6{

	static int test(){
		int a =20;
		int b=30;
		try{	
			// return a;
			b = b/0;
			throw new ArithmeticException();
		}
		// catch(IndexOutOfBoundsException e){

		// 	System.out.println("arithmetic");
		// 	System.out.println(e.getMessage());
		// 	System.out.println(e);
		// 	return a;
		// }

		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e);
			return a;

		}

		// finally{
		// 	System.out.println("working");
		// }
		
	}


	public static void main(String[] args) {	
		test();	
	}
}


// checked exception----- compile time --ClassNotFoundException
// unchecked exception------run time --Arithmatic Exception

//Throwable class