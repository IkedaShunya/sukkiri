package sukkiri.lesson03.practice.practice02;

public class Main {
	public static void main(String[] args) {
		
		int isHungry = 1;
		String food = "チキン";
		
		System.out.println("こんにちは");
		
		
		String result = isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです";
		
		if(isHungry == 0) {
			System.out.println(result);
			//System.out.println("お腹がいっぱいです");
		}else {
			System.out.println(result);
			//System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}
		
		
		
		
	}

}
