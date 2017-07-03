import java.util.*;

class ScannerInput{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your name");
		char a = obj.next().charAt(1);
		System.out.println(a);
		System.out.print("Enter age");
		int b = obj.nextInt();
		System.out.println(b);
		System.out.print(args[0]);

	}
}
