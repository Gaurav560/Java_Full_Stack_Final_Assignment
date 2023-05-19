
class Engine {

	public Engine() {
		System.out.println("Engine is created.");
	}
}

class SPortsCarEngine extends Engine {

	public SPortsCarEngine()
	{
		
		super();
		System.out.println("Engine class constructor is invoked.");
	}
	

}

public class SuperKeyWord {

	public static void main(String[] args)
	{
	
		//when u make object of child class ,child class constructor is called 
		//and super keyword is invoked and parent class costructor is invoked 
		SPortsCarEngine sEngine=new SPortsCarEngine();
		

	}

}
