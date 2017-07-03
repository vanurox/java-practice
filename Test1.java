interface I1{
	public static final int x = 20;

	void test();
}

interface I2 extends I1{

}

interface I3{
	void test2();
}
class Test implements I2,I3{
	public void test(){
		System.out.println("Working");
	}
}

public class Test1{
	public static void main(String[] args) {
		Test obj = new Test();
		obj.test();
		obj.test2();
	}
}