package sukkiri.lesson04.practice.print04.practice05;

public class Main {

	public static void main(String[] args) {
		/*下記表はA君のテストの点数です。
		各科目を要素の値に持つString型の配列subjectsと、
		各点数を要素の値に持つint型の配列scoresを作り、
		実行結果のような表示をしてください。*/
		
		String[] subjects = {"英語","国語","数学","社会","理科"};
		int[] scores = {75,80,60,90,55};
	
		
		for(int i = 0; i < subjects.length; i++) {
			if(i ==0) {
				System.out.print("A君:"+subjects[i] +" "+ scores[i]  +"点、" );
			}else if(i == subjects.length-1) {
				System.out.print( subjects[i] +" "+ scores[i]  +"点");
			}else {
				System.out.print(subjects[i] +" "+ scores[i]  +"点、" );
			}
			
			
		}
		
		/*
		System.out.print("A君" + subjects[0] +" "+ scores[0]  +"点、" );
		System.out.print( subjects[1] +" "+ scores[1]  +"点、");
		System.out.print( subjects[2] +" "+ scores[2]  +"点、");
		System.out.print( subjects[3] +" "+ scores[3]  +"点、");
		*/
		
		


	}

}
