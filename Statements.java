public class Statements{
	public static void main(String[] args) {
		Example obj = new Example("hi","hlo");
		String val1 = obj.a;
		String val2 = obj.b;
		System.out.print(val1+ " "+val2);
	}
}

class Example{
	String a,b;

	// Example(int val){
	// 	a = val;
	// }

	Example(int a1,int b1){
		// this(30);
	}

	Example(String a,String b){
		this.a = a;
		this.b = b;
	}

	void testing(int val,int val1){
		System.out.println("overloading");
	}

	void testing(int val,int val1,int val2){
		System.out.println("overloading");
	}
}

