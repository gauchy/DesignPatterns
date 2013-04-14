package example.wiki.factorymethod;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		CarFactory cf = new SedanFactory();
		Car car = cf.getCar("Deisel" , "Red");
	}

}
