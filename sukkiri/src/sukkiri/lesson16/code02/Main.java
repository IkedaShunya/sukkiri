package sukkiri.lesson16.code02;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> names = new ArrayList<String>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		
		Iterator<String> it = names.iterator();
		
		//矢印を次に進められるなら繰り返す
		while(it.hasNext()) {
			//矢印を次に進め、内容を取り出す
			String e = it.next();
			System.out.println(e);
		}

	}

}
