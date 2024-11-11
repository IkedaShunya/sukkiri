package db_operation.sample02;


public class Main {
	public static void main(String[] args) {
		DbOperation dbOperation = new DbOperation();
		
		dbOperation.connect();
		
		dbOperation.select();
		dbOperation.disconnect();
		
	}
	

}
