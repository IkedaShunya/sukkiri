package sukkiri.object_oriented.polymorphism.sample01;

public class Main {
	public static void main(String[] args) {
		//Animal 型配列に Dog インスタンス、Cat インスタンスを代入
		Animal[] animal = new Animal[2];
		animal[0] = new Dog(); 
		animal[1] = new Cat(); //・・・①
		//Breeder インスタンスを生成
		Breeder breeder = new Breeder();
		//各インスタンスの cry メソッドを呼出し
	
		
		for(int i=0; i<animal.length; i++) { 
			animal[i].cry(); 
		} //・・・②
		//breeder インスタンスの have メソッドの呼出し
		for(int i=0; i<animal.length; i++) {
			breeder.have(animal[i]); 
		}//・・・④

	}
}
