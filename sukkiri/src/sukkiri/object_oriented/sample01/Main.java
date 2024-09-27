package sukkiri.object_oriented.sample01;

public class Main {
	public static void main(String[] args) {
		//①インスタンス生成
		Animal dog = new Animal("ポチ", 3);
		//②インスタンスフィールドにアクセス
		dog.getName();
		//System.out.println(dog.getAge());
		//②インスタンスメソッドにアクセス
		dog.show();
		
		//"たま,5"のフィールド情報をもつAnimalインスタンスを作成し、変数catに代入
		Animal cat = new Animal("たま",5);
		cat.show();
		
		cat.setAge(7);
		cat.show();
	}
}
