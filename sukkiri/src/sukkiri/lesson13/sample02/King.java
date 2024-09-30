package sukkiri.lesson13.sample02;

public class King {
	public void talk(Hero h) {
		//System.out.println("王様：ようこそ我が国へ、勇者" + h.name + "よ。");
		//コード13-9のように、コメント部分(エラー箇所)の下に追記・・・getterの呼び出し
		System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ。");

		System.out.println("王様：長旅疲れたであろう。");
		System.out.println("王様：まずは城下町を見てくるとよい。ではまた会おう。");
		//privateの変数にアクセスしようとしているためエラー
		//	h.bye();
	}

}
