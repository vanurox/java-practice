public class Student extends Person{
	public int rollno;


	public static int a;
	Student(){
		// super("shilpa");
		this(100);
		System.out.println("Student class");
	}

	Student(int aa){
		System.out.println("student second cons" + aa);
	}

	void setRollno(int roll){
		rollno = roll;
	}

	int getRollno(){
		return rollno;
	}

	public void dummy(){
		super.dummy();
		System.out.println("Dummy func. in child class");
	}

	public static void dumy1(){
		System.out.println("static dumy");

	}
}