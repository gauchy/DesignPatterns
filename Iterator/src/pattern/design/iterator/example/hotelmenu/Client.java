package pattern.design.iterator.example.hotelmenu;

public class Client 
{
	
	public static void main(String args[])
	{

		Menu breakfastMenu = new Menu();
		breakfastMenu.add(new MenuItem("Poha", 12, true));	
		breakfastMenu.add(new MenuItem("idly", 12, true));
		breakfastMenu.add(new MenuItem("chicken", 102, false));
		breakfastMenu.add(new MenuItem("poori", 12, true));
		breakfastMenu.add(new MenuItem("upma", 22, true));
		breakfastMenu.add(new MenuItem("salad", 10, true));
		breakfastMenu.add(new MenuItem("sandwitch", 25, true));
		breakfastMenu.add(new MenuItem("juice", 12, true));
		breakfastMenu.add(new MenuItem("egg", 15, false));
		
		MenuIterator menuIterator =  breakfastMenu.createIterator();
		
		while(menuIterator.hasNext())
		{
			MenuItem menuItem = menuIterator.next();
			System.out.println(menuItem.getName() );
		}
		
	}
}
