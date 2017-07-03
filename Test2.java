import java.util.*;

public class Test2{
	public static void main(String[] args) {
		
		ArrayList ai = new ArrayList();
		ai.add(10);
		ai.add("nugen");
		ai.add(10.9);
		ai.add(10.9);

		System.out.println("First insertion"+ai);

		ai.add(1,"shilpa");

		System.out.println("Second insertion"+ai);

		ai.set(1,"nugen");
		System.out.println("Third updation"+ai);

		Object a = ai.get(100);
		System.out.println("get value "+a);


		int b = ai.size();
		System.out.println("size "+b);

		Boolean ab = ai.contains("shilpa");
		System.out.println("contains "+ab);

		ai.remove("nugen");
		System.out.println("current data " + ai);

		int bb = ai.indexOf("nugen");
		System.out.println("index" + bb);

	}
}

