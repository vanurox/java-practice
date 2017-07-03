import java.io.*;

class Input{
	public static void main(String arg[]) throws IOException{
		// System.out.println("Enter your first name");
		InputStreamReader is = new InputStreamReader(System.in);
		// FileReader fs = new FileReader("test");
		BufferedReader obj = new BufferedReader(is);
		String a = obj.readLine();
		// System.out.println("Enter your last name");
		// String b = obj.readLine();
		System.out.println(a );
	}
}

