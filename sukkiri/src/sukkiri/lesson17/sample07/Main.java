package sukkiri.lesson17.sample07;

public class Main {
	public static void main(String[] args) {
		//試験的に例外を発生させる
		try {
			throw new UnsupportedMusicFileException("未対応のファイルです");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
