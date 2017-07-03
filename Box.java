public class Box{

	public static void method1(Integer i){
		System.out.println(i);
	}


	public static void method2(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		// method1(1);

		Integer a = 20;
		System.out.println(a);
		Integer a = Integer.valueOf(10);
		method2(a);
	}
}

