package example.headfirst.decorator;
import example.headfirst.decorator.Beverage;
import example.headfirst.decorator.Espresso;
import example.headfirst.decorator.MochaDecorator;
import example.headfirst.decorator.SoyDecorator;



public class MainClient 
{
	public static void main(String args[])
	{
		Beverage beverage = new Espresso();
		beverage = new MochaDecorator(beverage);
		beverage = new SoyDecorator(beverage);
		beverage = new MochaDecorator(beverage);
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
	}
}
