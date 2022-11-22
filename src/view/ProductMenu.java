package view;

import controller.Console;
import controller.ProductController;

public class ProductMenu extends Menu{
public void ShowMenu() {
		
		boolean exe = true;
		while(exe) {
			System.out.println("Menu");
			System.out.println("1 - Registrar Produto");//
			System.out.println("2 - Procurar Produto pelo ID");//
			System.out.println("3 - Procurar Produto pelo Nome");
			System.out.println("4 - Remover Produto");
			System.out.println("0 - Menu Principal");//
	
			System.out.print("Opçao escolhida: ");
			
			ProductController controller = new ProductController();
			
			
			int option = Integer.parseInt(Console.readLine());
			switch (option) {
				case 1:
					controller.Register();
					break;
				case 2:
					System.out.println("Insira ID para busca: ");
					Integer id = Integer.parseInt(Console.readLine());
					controller.SearchID(id);
					break;
				case 3:
					System.out.println("Insira Nome para busca: ");
					String name = Console.readLine();
					controller.SearchString(name);
				case 0:
					exe = false;
					break;
				default:
					System.out.println("Opcao Invalida!"); 
			}
		}
	}
}