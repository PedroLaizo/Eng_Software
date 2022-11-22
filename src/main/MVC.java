package main;

import persist.OrderPersist;
import persist.Persist;
import persist.ProductPersist;
import view.MainMenu;

public class MVC {
	public static void main(String args[]) {
		
		OrderPersist order = OrderPersist.getUniqueInstance();
		order.setList(Persist.PersistLoad("OrderPersist"));
		
		ProductPersist product = ProductPersist.getUniqueInstance();
		product.setList(Persist.PersistLoad("ProductPersist"));
		
		MainMenu menu = new MainMenu();
		menu.ShowMenu();
	}
}