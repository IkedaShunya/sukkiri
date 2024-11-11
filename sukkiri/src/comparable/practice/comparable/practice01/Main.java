package comparable.practice.comparable.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Number> numberList = new ArrayList<>();
		numberList.add(new Number(5));
		numberList.add(new Number(2));
		numberList.add(new Number(8));

		// オブジェクトのリストをソート
		Collections.sort(numberList); //昇順

		for (Number number : numberList) { // ソートされたリストを出力
			System.out.println("Value: " +number.getValue());
		}
		
		System.out.println("---------------------");
		
		Collections.reverse(numberList); //昇順

		for (Number number : numberList) { // ソートされたリストを出力
			System.out.println("Value: " +number.getValue());
		}
		
		System.out.println("---------------------");
		
		StringBuilder sb = new StringBuilder();
		Collections.sort(numberList);
		for (Number number : numberList) { // ソートされたリストを出力
			sb.append(number.getValue());
		}
		
		Collections.reverse(numberList); //昇順
		for (Number number : numberList) { // ソートされたリストを出力
			sb.append(number.getValue());
		}
		
		System.out.println(sb.toString());
	}
}
