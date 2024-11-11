package file_operation.sample07;

import java.util.ArrayList;
import java.util.List;

//mainメソッドを持つクラス
public class Main {
	
	public static void main(String[] args) {
	//	1.	気温データをArrayListで持てるように宣言する
		List<TempData> tempDates = new ArrayList<>();
		
	//2.	CSVファイル操作をするクラスのインスタンス化
		CsvReader csvReader = new CsvReader();
		
	
	//	3.	CSVファイルの読み込みを行うメソッドを呼ぶ
	//アドレスの受け渡し
		csvReader.CsvFileReader(tempDates);
	//	4.	「月日　平均気温　最高気温　最低気温」を順番に表示する。
		
		for(TempData tempDate : tempDates) {
			System.out.print(tempDate.strDate()+" ");
			System.out.print("平均気温：" +tempDate.getAveTemp()+" ");
			System.out.print("最高気温：" +tempDate.getMaxTemp()+" ");
			System.out.print("最低気温：" +tempDate.getMinTemp()+" ");
			System.out.println();
			
		}

	}

}
