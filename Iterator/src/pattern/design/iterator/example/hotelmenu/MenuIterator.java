package pattern.design.iterator.example.hotelmenu;

import java.util.List;

public class MenuIterator implements Iterator<MenuItem>
{
	List<MenuItem> menuItems;
	int counter = 0;
	int size;
	MenuIterator(List<MenuItem> menuItems)
	{
		this.menuItems = menuItems;
		size = menuItems.size();
	}
	
	@Override
	public boolean hasNext()
	{
		if(counter < size)
			return true;
		return false;
	}

	@Override
	public MenuItem next() 
	{
		MenuItem menuItem = menuItems.get(counter);
		counter++;
		return menuItem;
	}

}
