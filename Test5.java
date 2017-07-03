import java.util.*;

class Test5{
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add("10");
		hs.add("nugen");
		hs.add(12);
		hs.add(21.2);

		System.out.println(hs);

		Iterator i = hs.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

		hs.remove("nugen");

		System.out.println(hs);

	}
}