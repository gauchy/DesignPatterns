package example.wiki.pattern.design.abstractfactory;

public class OSXButton implements Button 
{

	@Override
	public void paint() 
	{
		System.out.println("painting OSX button");
	}

}
