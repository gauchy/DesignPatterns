package example.wiki.pattern.design.abstractfactory;

public class WindowsTextbox implements Textbox 
{

	@Override
	public void setStyle(String style)
	{
		System.out.println("Setting the text style as " + style);
	}

}
