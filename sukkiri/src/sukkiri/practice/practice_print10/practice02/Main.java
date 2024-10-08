package sukkiri.practice.practice_print10.practice02;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Golden Retriever", true);
		info(dog);
		behavior(dog);
	}	
	/*infoメソッド(staticメソッド)
	　　　：戻り値なしで、引数にDogクラスのインスタンスを受け取る。
	出力結果例のように、「Breed」「Species」「Has fur」のコロンの右側をメソッドを使って、出力してください。
	*/
	
	public static void info(Dog dog) {
		System.out.println("Breed: " + dog.getBreeed());
		System.out.println("Species: " + dog.getSpecies());
		System.out.println("Has fur: " + dog.isHasFur());
		
	}
	
	/*
	 *　behaviorメソッド(staticメソッド)
　　　：戻り値なしで、引数にDogクラスのインスタンスを受け取る。
		出力結果例のように、Dogクラスで定義した、あるいは継承したメソッドを呼び出してください。
		
	 */
	public static void behavior(Dog dog) {
		dog.makeSound();
		dog.giveBirth();
		dog.wagTail();
	
	}

}
