package example.wiki.decorator;

public class Client 
{
	public static void main(String[] args)
	{
		TextComponent textComponent = new TextBox();
		textComponent = new UnicodeTextComponent(textComponent);
		textComponent = new RichTextComponent(textComponent);
		
		textComponent.draw();
		System.out.println("Description: " + textComponent.getDescription());
	}
}
