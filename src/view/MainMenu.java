package view;

import controller.Console;
import controller.Controller;
import factory.OrderFactory;
import factory.ProductFactory;

public class MainMenu extends Menu{

    @Override
    public void ShowMenu() {

        boolean exe = true;
        while(exe) {
            System.out.println("Menu");
            System.out.println("1 - Menu do Produto ");//
            System.out.println("2 - Menu de Venda");//
            System.out.println("0 - Sair");//

            System.out.print("Opçao escolhida: ");


            int option = Integer.parseInt(Console.readLine());
            switch (option) {
                case 1:
                    ProductFactory menuProduct = new ProductFactory();
                    Menu Menu = (Menu) menuProduct.cria("ProductMenu");
                    Menu.ShowMenu();
                    break;
                case 2:
                    OrderFactory menuOrder = new OrderFactory();
                    Menu Menu2 = (Menu) menuOrder.cria("OrderMenu");
                    Menu2.ShowMenu();
                    break;
                case 0:
                    Controller.ExitProgram();
                    exe = false;
                    break;
                default:
                    System.out.println("Opçao Invalida!"); 
            }
        }
    }
}