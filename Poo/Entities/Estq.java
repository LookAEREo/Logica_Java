package program;

public class Estq {

	public String name;
	public double unitPrice;
	public int quantity;

	public double price (double totalPrice) {
		return unitPrice * quantity;
	}
	
	public String toString() {
		return "Product name: " + name + "/" + " Price: " + "$" + String.format("%.2f", price(unitPrice)) + "/ "
				+ "Quantity in stock " + quantity + ".";
	}

	public void addProducts(int qtyA) {
		this.quantity += qtyA;
	}
	
	public void removeProucts(int qtyR ) {
		this.quantity -= qtyR;
	}

}
