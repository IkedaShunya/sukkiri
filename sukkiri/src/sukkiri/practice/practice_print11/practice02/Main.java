package sukkiri.practice.practice_print11.practice02;

public class Main {
	public static void main(String[] args) {
		ElectronicProduct  electronicProduct = new ElectronicProduct("Electronics", "Laptop", 999.99);
		electronicProduct.displayCategoryInfo();
		System.out.println("-------------------------------------");
		
		electronicProduct.displayProductInfo();
	}

}
