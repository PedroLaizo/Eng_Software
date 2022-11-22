package controller;

import java.util.ArrayList;

import factory.ProductFactory;
import model.Entity;
import model.Product;
import persist.ProductPersist;

public class ProductController extends Controller{
	
	@Override
	public void Register() {
		ProductFactory modelProduct = new ProductFactory();
		Product model = (model.Product) modelProduct.cria("Product");
		
		System.out.println("Registrar Produto");
		
		System.out.println("Insira o Nome: ");
		String Name = Console.readLine();
		System.out.println("Insira o ID: ");
		Integer ID = Integer.parseInt(Console.readLine());
		System.out.println("Insira o Preço de Produção: ");
		Float PriceProduction = Float.parseFloat(Console.readLine());
		System.out.println("Insira o Preço de Venda: ");
		Float Pricesell = Float.parseFloat(Console.readLine());
		System.out.println("Insira a Quantidade em Estoque");
		Integer qtd = Integer.parseInt(Console.readLine());
		
		model.constructor(Name, ID, PriceProduction, Pricesell, qtd);
		
		System.out.println("Produto Registrado!");
	}
	
	@Override
	public Entity SearchID(Integer ID) {
		
		ProductPersist product = ProductPersist.getUniqueInstance();
		
		ArrayList<Entity> list = product.getList();
		
		boolean find = false;
		
		while(!find) {
			for(Entity obj : list){
				if(obj.getID().equals(ID)) {
					find = true;
					return obj;
				}
			}
			if (!find) {
    			System.out.println("Nao Encontrado");
    			return null;
    		}
    	}
		return null;
    }

	@Override
	public Entity SearchString(String S) {

		ProductPersist product = ProductPersist.getUniqueInstance();
		
		ArrayList<Entity> list = product.getList();
		
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