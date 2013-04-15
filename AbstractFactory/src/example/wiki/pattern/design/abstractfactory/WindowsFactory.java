package example.wiki.pattern.design.abstractfactory;

public class WindowsFactory implements GUIFactory
{

	@Override
	public Button createButton() 
	{
		return new WindowsButton();
	}

	@Override
	public Textbox createTextbox() 
	{
		return new WindowsTextbox();
	}
	

}
