package sukkiri.lesson03.practice.addition.practice08;

public class Main {

	public static void main(String[] args) {
		//while文を使い、aから順にzまで表示させるプログラムを作成してください。
		//char c = ‘a’の値をインクリメントさせるとcの値は’b’になります。
		char []alphabet = new char[26];
		char c = 'a';
		int count =0;
		while(count < 26) {
			alphabet[count] = c;
			System.out.print(alphabet[count]);
			c++;
			count++;
		}

	}

}
