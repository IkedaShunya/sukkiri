package sukkiri.lesson15.practice_print15_01.practice05;

public class Main2 {
	//	各科目を要素の値に持つString型の配列ｓと、各点数を要素の値に持つint型の配列aを作り、
	//	実行結果のような表示をしてください。（実行結果はStringBuilderを用いて文字列を作る）
	//	※forの中で科目と点数を連結させていき、if文を使い、「、」を実行結果例に合うように連結させる。


	public static void main(String[] args) {
		String[] s = {"英語","国語","数学","社会","理科"};
		int[] a = {75,80,60,90,55};
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i <s.length; i++) {
			if(i ==s.length-1) {
				sb.append(s[i] +a[i]+"点");
			}else {
			sb.append(s[i] +a[i]+"点、");
			}
		}
		System.out.println(sb.toString());
		
		
		

	}

}
