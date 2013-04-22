package pattern.design.iterator.example.hotelmenu;

public class MenuItem {
	private String name;
	private float price;
	private boolean vegetarian;
	
	MenuItem(String name, float price,boolean vegetarian)
	{
		this.name = name;
		this.price = price;
		this.vegetarian = vegetarian;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getPrice() 
	{
		return price;
	}
	public void setPrice(float price) 
	{
		this.price = price;
	}
	public boolean isVegetarian()
	{
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian)
	{
		this.vegetarian = vegetarian;
	}
	

}
