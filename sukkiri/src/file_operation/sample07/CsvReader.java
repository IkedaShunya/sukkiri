package file_operation.sample07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

//CSVファイル操作を行うクラス
public class CsvReader {
	final String FILE_PATH;

	public CsvReader() {
		this.FILE_PATH = "file\\TempData.csv";
	}

	//	・	メソッド
	//	メソッド名：CsvFileReader
	//	引数：TempData型のList
	//	戻り値：なし
	//	処理：
	//	1.「yyyy/MM/dd」の書式フォーマットを宣言する
	//	2.try-catch-finallyもしくは資源付きtry-catchを使い、
	//	tryの中でファイル読み込み処理を行う。（P677もしくは資源付きP679のコード参照）
	//	CSVファイルの先頭に「#」の付いた行は、読み込まないように条件文を作る必要がある。
	//	CSVファイルは「日付,平均気温,最高気温,最低気温」の形でデータが作られているので、
	//	splitを使って列ごとにデータを分割して、
	//	TempDataクラスのコンストラクタに値を渡し、
	//	インスタンスを生成した後、Listに追加する。
	//	try-catchのExceptionについては、ファイル操作（IOException）及び、日付変換（ParseException）が必要となる。

	public void CsvFileReader(List<TempData> tempDatestest) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		//List<TempData> tempDates = new ArrayList<>();
		

		// try-with-resources 文を使ってファイルを開く
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH)); ) {
			String line;
			// ファイルを 1 行読み込み、データがある間繰り返す
			while ((line = br.readLine()) != null) {
				// １行表示
				if(line.charAt(0) =='#') {

				}else {
					String[] tempDataInf = line.split(",");
					TempData tempData =new TempData(
							dateFormat.parse(tempDataInf[0]), Double.parseDouble(tempDataInf[1]),
							Double.parseDouble(tempDataInf[2]), Double.parseDouble(tempDataInf[3]));
					tempDatestest.add(tempData);
				}
				

			}
		} catch (IOException| ParseException ex) {
			// IOException の例外処理
			ex.printStackTrace();
		}
		//return tempDates;



	}

}
