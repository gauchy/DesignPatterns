package pattern.design.adapter.example;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Real lion---");
		Lion realLion = new AfricanLion();
		realLion.makeSound();
		realLion.hunt();
		realLion.eat();
		realLion.sleep();
		
		System.out.println("\n");
		System.out.println("Fake lion---");
		Lion fakeLion = new LionAdapter();
		fakeLion.makeSound();
		fakeLion.hunt();
		fakeLion.eat();
		fakeLion.sleep();
		
	}

}
