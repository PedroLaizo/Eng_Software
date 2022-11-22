package controller;

import model.Entity;
import persist.OrderPersist;
import persist.Persist;
import persist.ProductPersist;

public class Controller {

	public void Register() {
	}
	
	public Entity SearchID(Integer ID) {
		return null;	
	}

	public Entity SearchString(String S) {
		return null;
	}

	public static void ExitProgram() {
		
		OrderPersist order = OrderPersist.getUniqueInstance();
		ProductPersist product = ProductPersist.getUniqueInstance();
		
		Persist.PersistSave(order.getList(), "OrderPersist");
		Persist.PersistSave(product.getList(), "ProductPersist");
	}
}
