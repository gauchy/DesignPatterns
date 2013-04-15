package example.wiki.pattern.design.abstractfactory;

public class Client 
{
	public static void main(String[] args)
	{
		GUIFactory fac = new WindowsFactory();
		Button btn  = fac.createButton();
		Textbox txt = fac.createTextbox();
		btn.paint();
		txt.setStyle("Royale");
		
		System.out.println();
		
		fac = new OSXFactory();
		btn = fac.createButton();
		txt = fac.createTextbox();
		btn.paint();
		txt.setStyle("Compiz");
	}
}
