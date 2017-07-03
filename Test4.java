import java.util.*;

public class Test4{
	public static void main(String[] args) {
		LinkedList li = new LinkedList();

		li.add(10);
		li.add("nugen");
		li.add("nugen");
		li.add(10.89);

		System.out.println(li);

		ListIterator i = li.listIterator();

		while(i.hasNext()){
			System.out.println(i.next());
		}

		while(i.hasPrevious()){
			System.out.println(i.previous());
		}

		li.remove(1);

		System.out.println(li);


	}
}
