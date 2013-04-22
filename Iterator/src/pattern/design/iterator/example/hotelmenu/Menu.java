package pattern.design.iterator.example.hotelmenu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private List<MenuItem> menuItems;
	Menu()
	{
		menuItems = new ArrayList<MenuItem>();
	}
	
	public void add(MenuItem menuItem)
	{
		menuItems.add(menuItem);
	}
	
	public MenuIterator createIterator()
	{
		return new MenuIterator(menuItems);
	}

}
