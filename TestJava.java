 class TestJava{
 	int a = 12;
	void test(){
		System.out.print("working");
	}
	public static void main(String arg[]){
		System.out.print("hii");
		TestJava obj = new TestJava();
		TestJava obj2 =  obj;
		obj.test();
	}
}

class Hi{

}

