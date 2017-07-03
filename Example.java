public class Example{
	public static void main(String[] args) {
		Student obj = new Student();

		obj.setName("nugen");
		 obj.setAge(10);
		 obj.setRollno(20);


		 String name = obj.getName();
		 int age = obj.getAge();
		 int rollno = obj.getRollno();

		 System.out.println("Name is "+name + " " + "Age is " + age + " " + "Rollno is" + rollno);


		obj.dummy();

		Student.dumy1();

		int b =  Student.a;

		System.out.println(b);

	}
}