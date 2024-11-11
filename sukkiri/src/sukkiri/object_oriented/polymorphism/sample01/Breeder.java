package sukkiri.object_oriented.polymorphism.sample01;

public class Breeder {
	public void have(Animal animal) { //・・・③
		
		//インターフェイス型のメソッドを受け取っている
		System.out.println( animal.getKind()+"を飼っているの" );
		}
}
