package example.wiki.pattern.design.abstractfactory;

public class WindowsButton implements Button{

	@Override
	public void paint() 
	{
		System.out.println("Painting windows button");
	}

}
