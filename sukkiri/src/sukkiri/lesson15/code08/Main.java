package sukkiri.lesson15.code08;

public class Main {
	public static void main(String args[]) {
		String s = "abc,def:ghi";

		//「beh」のところ「X」のところで分割する
		String w = s.replaceAll("[beh]","X");


		System.out.println(w);  //aXc,dXf:gXi
		
		
		String str ="こんにちはJava";
		char[] data1 = str.toCharArray();
		//byte[] data2 = str.getBytes("utf-8");
		byte[] data3 = str.getBytes();
		
		for(char a : data1) {
			System.out.println(a);
		}
		
		/*for(byte b : data2) {
			System.out.println(b);
		}*/
		
		for(byte c : data3) {
			System.out.println(c);
		}

	}

}
