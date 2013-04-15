package example.wiki.pattern.design.abstractfactory;

public class OSXTextbox implements Textbox 
{

	@Override
	public void setStyle(String style)
	{
		System.out.println("Setting the style as " + style);
	}

}
