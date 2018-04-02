
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shoppingcart mycart = Shoppingcart.getInstance();
		mycart.item.add("Milk");
		mycart.item.add("Coffee");
		mycart.item.add("Tea");
		mycart.item.add("Sugar");
		
		mycart.displayitems();
		
		

	}

}
