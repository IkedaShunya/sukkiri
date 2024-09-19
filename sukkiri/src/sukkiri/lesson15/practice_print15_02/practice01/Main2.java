package sukkiri.lesson15.practice_print15_02.practice01;

public class Main2 {

	public static void main(String[] args) {
		/*下記表はA君のテストの点数です。
		各科目を要素の値に持つString型の配列subjectと、
		各点数を要素の値に持つint型の配列scoreを作り、
		実行結果のような表示をしてください。*/
		String[] subject = {"英語","国語","数学","社会","理科"};
		int[] score  = {5,80,60,100,55};
		
		String FORMAT ="%-2s :458u %3d\n";
		
		for(int i =0; i< subject.length; i++) {
			System.out.printf(FORMAT,subject[i],score[i]);
		}


	}

}
