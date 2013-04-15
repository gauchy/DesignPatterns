package example.wiki.pattern.design.abstractfactory;

public class OSXFactory implements GUIFactory{

	@Override
	public Button createButton()
	{
		return new OSXButton();
	}

	@Override
	public Textbox createTextbox()
	{
		// TODO Auto-generated method stub
		return new OSXTextbox();
	}

}
