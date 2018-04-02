
import java.util.*;

public class Shoppingcart {
	
	
	private static Shoppingcart cart;
    ArrayList<String> item = new <String> ArrayList<String>();
	
	
	private  Shoppingcart() // private constructor for restricting making objects
	{
		
	}
	
	public static Shoppingcart getInstance() // singleton object
	{
		if(cart==null)
		{
			cart = new Shoppingcart();
			return cart;
		}
		
		else
		{
			return cart;
		}
	}
	
	
	public void addItems(String items)
	{
		
		this.item.add(items);
		System.out.println("...Product Added...");
	}
	
	
	public void removeitems(String items)
	{
		this.item.remove(items);
		System.out.println("...Product Removed...");
	}
	
	
	public void getCartsize()
	{
		System.out.println("You have the " + this.item.size() );
	}
	
	
	
	public void displayitems()
	{
		if(this.item.size() != 0)
		{
			System.out.println("Your items are ");
			for(int i = 0; i<this.item.size();i++)
			{
				
				System.out.println(i+1 + "." + this.item.get(i));
			}	
		}
		
		else
		{
			System.out.println("Your cart is empty");
		}
	}
	
}
