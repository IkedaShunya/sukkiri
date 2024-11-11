package comparator.practice.comparator.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();

		Product laptop = new Product("Laptop", 899.99);
		Product phone = new Product("Phone", 599.99);
		Product tablet = new Product("Tablet", 349.99);
		productList.add(laptop);
		productList.add(phone);
		productList.add(tablet);
		
		// 比較基準のインスタンスを生成し、ソートする
		PriceComparator priceComparator = new PriceComparator();
		Collections.sort(productList, priceComparator); 
		// ソートされたリストを出力
		for (Product product : productList) {
			System.out.println("Product:"+product.getName() +"   Price:$" +product.getPrice());
		}


		Collections.sort(productList, Collections.reverseOrder(priceComparator)); //降順		// ソートされたリストを出力
		for (Product product : productList) {
			System.out.println("Product:"+product.getName() +"   Price:$" +product.getPrice());
		}


	}

}
