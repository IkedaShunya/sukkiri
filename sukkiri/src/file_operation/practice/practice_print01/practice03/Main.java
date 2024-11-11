package file_operation.practice.practice_print01.practice03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		csvFileReader();
	}
	
	public static void csvFileReader() {
		String filepath = "C:\\Users\\3030670\\git\\sukkiri\\sukkiri\\file\\AnimalData.txt";
		// try-with-resources 文を使ってファイルを開く
		//filepathの読み込みして、インスタンス作成
		try( FileReader fr = new FileReader(filepath);
				BufferedReader br = new BufferedReader(fr); ) {
			String line;
			// ファイルを 1 行読み込み、データがある間繰り返す
			//テキスト行を読み込みます。
			while ((line = br.readLine()) != null) {
				// １行表示
				System.out.println(line);
			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();
		}
	}
	
	
	

}
