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
		
		System.out.println();
		
		TextComponent textComponent2 = new TextArea();
		textComponent2 = new UnicodeTextComponent(textComponent2);
		textComponent2 = new RichTextComponent(textComponent2);
		
		textComponent2.draw();
		System.out.println("Description: " + textComponent2.getDescription());
		
	}
}
