package sukkiri.lesson15.practice_print15_02.practice01;

public class Main {

	public static void main(String[] args) {
		/*下記表はA君のテストの点数です。
		各科目を要素の値に持つString型の配列subjectと、
		各点数を要素の値に持つint型の配列scoreを作り、
		実行結果のような表示をしてください。*/

		String[] subtject = {"英語","国語","数学","社会","理科"};
		int[] score = { 5,80,60,100,55};
		
		
		
		for(int i =0; i <subtject.length; i++) {
			System.out.printf("%-2s :%-3d\n",subtject[i],score[i]);
		}

	}

}
