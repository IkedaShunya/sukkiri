package sukkiri.practice.practice_print11.practice02;

public class ElectronicProduct extends Product{
	public ElectronicProduct(String categoryName, String productName,double price) {
		super(categoryName, productName,price);
	}
	
	@Override
	public void displayCategoryInfo() {
		System.out.println("Category:"  +getCategoryName());
	};
	
    
	
	@Override
	public void displayProductInfo() {
		System.out.println("Category: " + getCategoryName());
		System.out.println("Product: " + getProductName());
		System.out.println("Price: " + getPrice());
		System.out.println("This is an" + getCategoryName()  +"product.");
		
	}
	

}
