package example.wiki.decorator;

public class TextBox implements TextComponent{

	@Override
	public void draw()
	{
		System.out.println("Drawing simple textbox");
	}

	@Override
	public String getDescription()
	{
		return "TextBox";
	}

}
