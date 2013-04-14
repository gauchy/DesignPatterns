package example.wiki.decorator;

public class RichTextComponent extends TextComponentDecorator {

	RichTextComponent(TextComponent textComponent) 
	{
		super(textComponent);
	}

	@Override
	public void draw() 
	{
		textComponent.draw();
		System.out.println("Enabling rich text");
		
	}

	@Override
	public String getDescription()
	{
		return textComponent.getDescription() + " with RichText";
	}

}
