package sukkiri.practice.practice_print11.practice02;

public abstract class Product extends Category{
	
	String productName;
	double price;
	
	
	
	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Product(String categoryName, String productName,double price) {
		super(categoryName);
		this.productName = productName;
		this.price = price;
		
	}
	
	
	public abstract void displayCategoryInfo();
	
}
