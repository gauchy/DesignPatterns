package example.wiki.decorator;

public abstract class TextComponentDecorator implements TextComponent
{
	TextComponent textComponent;
	
	TextComponentDecorator(TextComponent textComponent)
	{
		this.textComponent = textComponent;
	}
	
}
