package file_operation.sample01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		//user.dirで絶対パスの表示
		System.out.println(System.getProperty("user.dir"));
		
		
		//テキスト内容書き込みたいときは下記をコピーする
		// 読み込むファイルを指定
		String filepath = "data.txt";
		// try-with-resources 文を使ってファイルを開く
		//filepathの読み込みして、インスタンス作成
		try( FileReader fr = new FileReader(filepath);
				BufferedReader br = new BufferedReader(fr); ) {
			String line;
			System.out.println(br.readLine());
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
