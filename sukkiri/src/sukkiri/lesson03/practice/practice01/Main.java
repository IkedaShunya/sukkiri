package sukkiri.lesson03.practice.practice01;

public class Main {
	public static void main(String[] args) {
		
		//①変数weightの値が60に等しい
		int weight = 60;
		System.out.println(weight == 60);
		
		//②変数age1とage2の合計を2倍したものが60を超えている
		int age1 = 10;
		int age2 = 20;
		System.out.println((age1+age2)*2 > 60);
		
		
		//③変数ageが奇数である
		//age % 2 ==1
		int age = 8;
		System.out.println(age % 2 ==1);
		
		//④変数nameに代入された文字列「湊」が等しい
		//name.equals("湊")
		String name = "湊";
		System.out.println( name.equals("湊"));
		
	}

}
