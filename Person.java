public class Person{
	protected String name;
	protected int age;

	Person(){
		System.out.println("Person class");
	}

	Person(String val){
		System.out.println("Second Constructor of person class");
	}

	void setName(String n){
		name =n;
	}

	void setAge(int a){
		age= a;
	}

	String getName(){
		return name;
	}

	int getAge(){
		return age;
	}


	public void dummy(){
		System.out.println("Parent dummy fuc.");
	}
}