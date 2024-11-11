package sukkiri.practice.practice_print11.practice06;

import java.util.Scanner;

//Mainクラス
//2つ数字と四則演算子を入力を指示し、
//その入力内容に基づいて計算を実施するクラス

public class OprTester {
	public static void main(String[] args) {
		//数値・四則演算子の入力を指示
		Scanner scan = new Scanner(System.in);
		System.out.print("1つめ：");
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.print("2つめ：");
		int num2 = Integer.parseInt(scan.nextLine());
		System.out.printf("計算する記号を入力（%s,%s,%s,%s）"
				,IOperation.INT_ADD,IOperation.INT_SUB,IOperation.INT_MUL,IOperation.INT_DIV);
		char symbol = scan.nextLine().charAt(0);
		
		
		//symbol（四則演算子）とIOperationの定数を比較し、 
		//Add, Sub, Mul, Divのいずれかのクラスのインスタンスを生成する。
		//例）「+」のときはAddクラス、「-」のときはSubクラス、
	
		IOperation io;
		
		switch(symbol) {
		
		//四則演算子(symbol) が+の場合
		case IOperation.INT_ADD ->{
			io = new Add();
			
		}
		
		//四則演算子(symbol) が-の場合
		case IOperation.INT_SUB ->{
			io = new Sub();
			
		}
		
		
		//四則演算子(symbol) が*の場合
		case IOperation.INT_MUL ->{
			io = new Mul();
			
		}
		
		//四則演算子(symbol) が/の場合
		case IOperation.INT_DIV ->{
			io = new Div();
			
		}
		
		//四則演算子(symbol) が正しく入力されていない場合（+-*/以外）
		default ->{
			System.out.println("四則演算の記号ではありません");
			io = null;
		}
		
		}
		
		//四則演算子（+-*/）が入力された場合は計算を実施し、式を表示する
		if(io != null) {
			int result = io.intCalc(num1,num2);
			io.show(num1,num2,result);
		}
	}
	
	

}
