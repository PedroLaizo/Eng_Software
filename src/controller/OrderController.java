package controller;

import java.util.ArrayList;

import factory.OrderFactory;
import model.Entity;
import model.Order;
import persist.OrderPersist;

public class OrderController extends Controller{
	
	@Override
	public void Register() {
		OrderFactory modelOrder = new OrderFactory();
		Order model = (model.Order) modelOrder.cria("Order");
		
		System.out.println("Registrar Venda");
		
		System.out.println("Insira o Nome: ");
		String Name = Console.readLine();
		System.out.println("Insira o  ID: ");
		Integer ID = Integer.parseInt(Console.readLine());
		System.out.println("Insert Document Number");
		String DocumentNumber = Console.readLine();
		
		model.constructor(Name, ID, DocumentNumber);
		
		System.out.println("Venda Registrada");
		
		
		
		
		
	}	
	
	@Override
	public Entity SearchID(Integer ID) {
		
		OrderPersist order = OrderPersist.getUniqueInstance();
		
		ArrayList<Entity> list = order.getList();
		
		boolean find = false;
		
		while(!find) {
			for(Entity obj : list){
				if(obj.getID().equals(ID)) {
					find = true;
					return obj;
				}
			}
			if (!find) {
    			System.out.println("Não Encontrado");
    			return null;
    		}
    	}
		return null;
    }

	@Override
	public Entity SearchString(String S) {

		OrderPersist order = OrderPersist.getUniqueInstance();
		
		ArrayList<Entity> list = order.getList();
		
		boolean find = false;
		
		while(!find) {
			for(Entity obj : list){
				if(obj.getName().equals(S)) {
					find = true;
					return obj;
				}
			}
			if (!find) {
    			System.out.println("Not Found");
    			return null;
    		}
    	}
		return null;
	}
}