package view;

import controller.Console;
import controller.OrderController;

public class OrderMenu extends Menu{
public void ShowMenu() {
		
		boolean exe = true;
		while(exe) {
			System.out.println("Menu");
			System.out.println("1 - Registra Venda");//
			System.out.println("2 - Procurar Venda pelo ID");//
			System.out.println("3 - Procurar Venda pelo Nome");
			System.out.println("4 - Remover Venda");
			System.out.println("0 - Menu Principal");//
	
			System.out.print("Opçao escolhida: ");
			
			OrderController controller = new OrderController();
			
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
					System.out.println("Opçao Invalida!"); 
			}
		}
	}
}