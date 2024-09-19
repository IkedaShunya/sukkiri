package sukkiri.lesson16.code01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Integer型の配列を宣言
		List<Integer> points =new ArrayList<>();
		
		//ボートボクシングで自動的にIntegerに変換(本当ならInteger型のインスタンスを作ってから入れなければならない)
		//　Integer　i1 = Integer.valueOf(10): 
		
		points.add(10);
		points.add(80);
		points.add(75);
		
		for(int point : points) {
			System.out.println(point);
		}

	}

}
