package sukkiri.lesson16.practice03;

public class Hero {
	private String name;
	private int enemyNum;
	
	public Hero(String name , int enemyNum) {
		this.name =name;
		this.enemyNum =enemyNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getEnemyNum() {
		return this.enemyNum;
	}

}
