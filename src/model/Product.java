package model;

public class Product extends Entity{
	
	private static final long serialVersionUID = 1L;
	
	private Float PriceProdution;
	private Float PriceSell;
	private Integer QuantityStock;
	
	public Float getPriceProdution() {
		return PriceProdution;
	}
	public void setPriceProdution(Float priceProdution) {
		PriceProdution = priceProdution;
	}
	public Float getPriceSell() {
		return PriceSell;
	}
	public void setPriceSell(Float priceSell) {
		PriceSell = priceSell;
	}
	public Integer getQuantityStock() {
		return QuantityStock;
	}
	public void setQuantityStock(Integer quantityStock) {
		QuantityStock = quantityStock;
	}
	
	public String toString() {
		return "	|	Name: " + getName() + "\n"
        		+ 	"	|	ID: " + getID() + "\n"
        		+ 	"	|	Cost of production: " + PriceProdution + "\n"
        		+ 	"	|	Value: " + PriceSell + "\n"
        		+	"	|	Stock: " + QuantityStock + "\n";
	}
	
	public void constructor(String Name, Integer id, Float pd, Float sell, Integer qtd) {
    	this.setName(Name);
    	this.setID(id);
    	this.setPriceProdution(pd);
    	this.setPriceSell(sell);
    	this.setQuantityStock(qtd);
    }
}