import java.util.*;
public class Test3{
	public static void main(String[] args) {
		Vector v = new Vector();

		v.addElement(10);
		v.addElement("nugen");
		v.addElement("abc");
		v.addElement(10.56);


		System.out.println("Elements are"+v);

		int a = v.capacity();

		System.out.println("Capacity"+a);

		Object obj = v.elementAt(1);
		System.out.println("Element at"+obj);

		Object obj1 = v.firstElement();
		System.out.println("First Element"+obj1);


		Object obj2 = v.lastElement();
		System.out.println("Last Element"+obj2);

		v.removeElement(10);
		System.out.println("Elements"+v);


		v.setElementAt("it service",1);
		System.out.println("Elements"+v);

	}
}