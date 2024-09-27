package sukkiri.lesson08;

import java.util.Random;

public class Cleric {
	
	String name;
	int hp =50;
	final int MAXHP =50;
	int mp =10;
	final int  MAXMP = 10; 
	
	public void selfAid(){
		this.mp -=5;
		this.hp = MAXHP;
	}
	
	public int pray(int sec) {
		Random rand = new Random();
		int plus = rand.nextInt(3);
		
		this.mp += (sec+plus);
		if(this.MAXMP < this.mp) {
			this.mp = this.MAXMP;
		}
		
		return this.mp;
	}

}
