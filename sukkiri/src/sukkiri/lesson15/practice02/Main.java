package sukkiri.lesson15.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//フォルダ名、ファイル名用の変数を用意
		String folder =null;
		String file = null;
		
		//フォルダ名、ファイル名の入力を指示
		Scanner scan = new Scanner(System.in);
		System.out.println("フォルダ場所を入力してください：");
		folder = scan.nextLine();
		System.out.println("ファイル名を入力してください：");
		file = scan.nextLine();
		
		//もし、フォルダ名の終わりが「\」でないなら、フォルダ名の末尾に「￥」を追加する。
		if(!(folder.endsWith("\\"))){
			folder += "\\";
		}
		
		String fileName = folder + file;
		
		System.out.println(fileName);
		
		scan.close();

	}

}
