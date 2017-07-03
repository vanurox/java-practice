import java.util.*;

class Test7{
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("nugen");
		System.out.println("First"+name);
		name.append("abc");
		StringBuilder hi = new StringBuilder("workingfine");
		name = hi;
		System.out.println(name);

		name.replace(1,3,"noo");

		System.out.println(name);

		name.insert(1,"hlo");
		System.out.println(name);

		// name.reverse();
		// System.out.println(name);

		String a = name.substring(3,7);
		System.out.println("substring "+a);

	}
}
