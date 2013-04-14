package example.wiki.decorator;

public class TextArea implements TextComponent{

	@Override
	public void draw() 
	{
		System.out.println("Drawing simple TextArea");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "TextArea";
	}

}
