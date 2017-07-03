	
abstract class Test{
	 // void test(){
	 // 	System.out.println("Testing");
	 // }

	 void test2(){
	 	System.out.println("Reference ");
	 }
}

class Test1 extends Test{
	void test(){
		System.out.println("Working");
	}
}



public class AbstractTest{

	public static void main(String[] args) {
		Test obj = new Test1();
		obj.test2();
	}
}