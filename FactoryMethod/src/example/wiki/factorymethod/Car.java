package example.wiki.factorymethod;

public abstract class Car {
	
	public abstract void addEngine(String engineType);
	
	public void color(String color)
	{
		System.out.println("painting car in " + color);
	}
	
	
}
