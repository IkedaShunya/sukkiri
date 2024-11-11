package comparator.practice.comparator.practice01;

import java.util.Comparator;

public class Product{
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}




class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		double result= product1.getPrice()-product2.getPrice();

		if(result < 0) {
			return -1;

		}else if(result > 0) {
			return 1;
		}else {
			return 0;
		}

	}
	
}






