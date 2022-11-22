package persist;

import java.util.ArrayList;

import model.Entity;

public class ProductPersist extends Persist{

	private ArrayList<Entity> list = new ArrayList<Entity>();
	
	private static ProductPersist uniqueInstance = new ProductPersist();
	
	public static ProductPersist getUniqueInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new ProductPersist();
		return uniqueInstance;
	}

	public ArrayList<Entity> getList() {
		return list;
	}

	public void setList(ArrayList<Entity> list) {
		this.list = list;
	}
}