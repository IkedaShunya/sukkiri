package sukkiri.lesson16.code7;

import java.util.HashMap;
import java.util.Map;

//keySet()メソッドでキーの一覧→get（）メソッドでキーに対しての値を取得
public class Main {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();

		//ペアで値を格納
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 182);
		
		System.out.println(prefs.keySet());
		
		//
		//keySet()メソッドでキーの一覧を取得
		
		for(String key : prefs.keySet()) {
			//get（）メソッドでキーに対しての値を取得
			int value = prefs.get(key);
			System.out.println(key +"の人口は" +value +"です。");
		}

	}

}
