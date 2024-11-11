package file_operation.practice.practice_print01.practice02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		String readFilepath = "C:\\Users\\3030670\\git\\sukkiri\\sukkiri\\file\\AnimalData.txt";
		String writeFilepath = "C:\\Users\\3030670\\git\\sukkiri\\sukkiri\\file\\AnimalData2.txt";
		
		// try-with-resources 文を使ってファイルを開く
		//filepathの読み込みして、インスタンス作成
		try( FileReader fr = new FileReader(readFilepath);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(writeFilepath);
				BufferedWriter bw = new BufferedWriter(fw);
				) {
			String line;
			
			// ファイルを 1 行読み込み、データがある間繰り返す
			//テキスト行を読み込みます。
			while ((line = br.readLine()) != null) {				
				bw.write(line); // ファイルに書き込み
				bw.newLine();// 改行
				System.out.println(line);
			}
			
			
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();
		}
	}
}


