package sukkiri.practice.practice_print10.practice01;

public class Animal {
	final String livingBeings ="動物";
	String kind;
	
	public Animal() {
		System.out.println(livingBeings + "が生成されました");
		
	}
	
	public Animal(String kind) {
		System.out.println("種は"+ kind +"のインスタンスが生成されました");
		this.kind = kind;
	}
	
	public void showProfile() {
		System.out.println("カテゴリは" +livingBeings);
	}
	
	public String getKind() {
		return this.kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}

}
