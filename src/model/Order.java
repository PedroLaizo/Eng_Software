package model;

import java.util.ArrayList;

public class Order extends Entity{

    
	private static final long serialVersionUID = 1L;
	
	private String DocumentNumber;
    private Float TotalPrice;

	private ArrayList<Product> productList = new ArrayList<Product>();

    public String toString() {
        String content =  "	|	Name: " + getName() + "\n"
        		+ 	"	|	ID: " + getID() + "\n"
        		+ 	"	|	DocumentNumber: " + DocumentNumber + "\n"
        		+ 	"	|	TotalPrice: " + TotalPrice + "\n";
        for (Product product: productList) {
        	content += product.toString();
        }
        
        return content;   		
    }
    
    public void constructor(String Name, Integer id, String dn) {
    	this.setName(Name);
    	this.setID(id);
    	this.setDocumentNumber(dn);
    	this.setTotalPrice(totalPrice());
    }
    

    
    public Float totalPrice() {
    	Float valor = (float) 0;
    	for(Product produtos: productList) {
    		valor += produtos.getPriceSell();
    	}
		return valor;
    }
    
	public String getDocumentNumber() {
		return DocumentNumber;
	}

	 public Float getTotalPrice() {
			return TotalPrice;
	 }

	public void setTotalPrice(Float totalPrice) {
		TotalPrice = totalPrice;
	}
		
	public void setDocumentNumber(String documentNumber) {
		DocumentNumber = documentNumber;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}