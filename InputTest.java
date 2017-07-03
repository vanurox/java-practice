import java.util.*;

public class InputTest{
		static int i;
	public static void main(String[] args) {
		Example obj = new Example();
		Scanner scn = new Scanner(System.in);
		
		while(i<4){
		System.out.println("enter side of square");
		int s = scn.nextInt();
		obj.setSide(s);
		int s1 = obj.getSide();
		System.out.println("You enter "+s1);
		int area = obj.findArea(s1);
		System.out.println("Area " + area);
		i++;
		}

		int j = 11;
		do{
			while(i<3){
				System.out.println("while");
				i++;
			}
			System.out.println("do while");
		}while(j<10);
	}
}


class Example{
	int a;

	void setSide(int side){
		a = side;
	}

	int getSide(){
		return a;
	}

	int findArea(int side){
		return side*side;
	}
}