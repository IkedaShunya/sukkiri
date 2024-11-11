package file_operation.sample07;

import java.text.SimpleDateFormat;
import java.util.Date;
//日付、平均・最高・最低気温の値を持つクラス
public class TempData {
	Date Date;
	double aveTemp;
	double maxTemp;
	double minTemp;
	
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public double getAveTemp() {
		return aveTemp;
	}
	public void setAveTemp(double aveTemp) {
		this.aveTemp = aveTemp;
	}
	public double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	
	
	public TempData(Date date,double aveTemp,double maxTemp,double minTemp) {
		setDate(date);
		setAveTemp(aveTemp);
		setMaxTemp(maxTemp);
		setMinTemp(minTemp);
	}
	
//	2.	strDateメソッドを定義する
//	処理：Date型をString型に変換して値を返す。
//	※書式設定は「yyyy/MM/dd」
	public String strDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String strDate = dateFormat.format(getDate());
		
		return strDate;
	}

	

}
