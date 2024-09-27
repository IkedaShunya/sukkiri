package sukkiri.object_oriented.sample01;

public class Main {
	public static void main(String[] args) {
		//①インスタンス生成
		Animal dog = new Animal("ポチ", 3);
		//②インスタンスフィールドにアクセス
		dog.getName();
		System.out.println(dog.getAge());
		//②インスタンスメソッドにアクセス
		dog.show();
	}
}
