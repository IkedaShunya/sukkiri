package file_operation.practice.practice_print01.practice04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvOperation {
	private final String filepath ="file\\AnimalData.txt"; 


	public void csvFileReader() {
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
