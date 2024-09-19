package sukkiri.lesson15.code03;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java programming";
		
		//s1.substring(3) ４文字目から最終文字まで切りだす
		System.out.println("文字列s1の４文字目以降は" + s1.substring(3));
		//s1.substring(3) ４~8文字までを切りだす（index 9文字目の文字は切り出されない）
		System.out.println("文字列s1の４文～8文目は" + s1.substring(3,8));
		
		
		System.out.println("文字列s1の４文～8文目は" + s1.charAt(3));
		
		System.out.println(s1.replace("a","A"));
		
		System.out.println(s1.replaceAll("a","A"));


	}

}
