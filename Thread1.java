class Example extends Thread{
	Example(String name){
		super(name);
	}

	Example(){

	}
	public void run(){
		for(int i = 1;i<=10;i++){
			System.out.println("Thread execute "+Thread.currentThread().getId() +" "+i);

		}
		try{
			Thread.sleep(1000);
		}

		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}

	}
}

public class Thread1{
	public static void main(String[] args) {
		Example obj = new Example("Nugen");
		Example obj1 = new Example();
		obj.start();
		obj1.start();
	}
}

// run

// start

// sleep

// yield

// join


//getName
 //getId