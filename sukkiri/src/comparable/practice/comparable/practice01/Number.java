package comparable.practice.comparable.practice01;

public class Number implements Comparable<Number>{
	private int value;
	
	public Number(int value) {
		this.value = value;
	}
	
	@Override
	public int compareTo(Number otherNumber) {
	return this.value - otherNumber.value; // 例: 年齢を比較する場合
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
