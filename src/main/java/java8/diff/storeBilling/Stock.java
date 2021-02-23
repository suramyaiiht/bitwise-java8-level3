package java8.diff.storeBilling;
import java.util.HashMap;
import java.util.Map;
public class Stock {
	private static Map<String,Item> itemMap=new HashMap<String, Item>();
	static
	{
		itemMap.put("SOAP",new Item("SOAP",37.5));
		itemMap.put("SUGAR",new Item("SUGAR",45.0));
		itemMap.put("RICE",new Item("RICE",67.5));
		itemMap.put("TEA",new Item("TEA",125.50));
		itemMap.put("COFFEE",new Item("COFFEE",150.0));
		itemMap.put("WHEAT",new Item("WHEAT",55.0));
		itemMap.put("SALT",new Item("SALT",17.5));
		itemMap.put("TOOTHPASTE",new Item("TOOTHPASTE",75.0));
		itemMap.put("DAL",new Item("DAL",85.0));
		itemMap.put("SPICE",new Item("SPICE",95.0));
	}
	public static Map<String,Item> getAllItems()
	{
		//write the code to return the all items
		return null;
	}
		public static Item getItem(String itemName)
		{
			// write the code to get the given item details from the list
			return null;
		}
}
