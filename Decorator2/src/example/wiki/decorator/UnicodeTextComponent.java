package example.wiki.decorator;

public class UnicodeTextComponent extends TextComponentDecorator
{

	UnicodeTextComponent(TextComponent textComponent)
	{
		super(textComponent);
	}

	@Override
	public void draw() 
	{
		textComponent.draw();
		System.out.println("Enabling unicode");
	}

	@Override
	public String getDescription() 
	{
		return textComponent.getDescription() + " with Unicode" ;
	}

}
