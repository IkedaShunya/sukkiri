package db_operation.practice_print05;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		DbOperation dbOperation = new DbOperation();
		
		dbOperation.connect();
		List<Kakeibo> kakeiboList = dbOperation.select();
		
		for(Kakeibo kakeibo : kakeiboList) {
			System.out.println("======================");
			kakeibo.show();
		}
		
	}

}
