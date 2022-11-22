package persist;

import java.util.ArrayList;

import model.Entity;

public class OrderPersist extends Persist{
	
	private ArrayList<Entity> list = new ArrayList<Entity>();
	
	private static OrderPersist uniqueInstance = new OrderPersist();

	public static OrderPersist getUniqueInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new OrderPersist();
		return uniqueInstance;
	}

	public ArrayList<Entity> getList() {
		return list;
	}

	public void setList(ArrayList<Entity> list) {
		this.list = list;
	}
	
}