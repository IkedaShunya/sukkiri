package sukkiri.lesson02.practice.practice_print01.practice11;

public class Main {

	public static void main(String[] args) {
		/*int型の変数x、yに数値23、5をそれぞれ代入してｘ÷ yの商(割り算の解)と剰余(余りのこと)を
		コンソール画面に表示しましょう。*/
		
	int x = 23;
	int y = 5;
	
	//xをyで割った商
	int z = x / y;
	//xをyで割ったあまり
	int w =  x % y;
	
	System.out.printf("商：%s\n" ,z);
	System.out.println("剰余：" + w);


	}

}
