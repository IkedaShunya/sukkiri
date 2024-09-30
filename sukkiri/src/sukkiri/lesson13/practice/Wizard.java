package sukkiri.lesson13.practice;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void heal(Hero h) {
//		基本回復ポイント
		int basePoint =10;
		//杖による増幅
		int recovPoint =
				(int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "HPを" + recovPoint + "回復した！");
	}
	

}
