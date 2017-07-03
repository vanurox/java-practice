package conversion;
import java.io.*;
public class TypeConversion  {
		static int aa;
	public static void main(String args[]) throws IOException{
		double a = 1.90;
		float b = (float)a;

		int c = 4;
		float d = c;

		System.out.println("double"+a);
		System.out.println("float"+b);
		System.out.println(aa);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String anj = br.readLine();
		System.out.println(anj);
	}
}

