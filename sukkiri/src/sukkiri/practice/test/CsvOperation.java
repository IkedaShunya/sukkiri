package src.sukkiri.practice.test;

import java.io.*;
import java.util.ArrayList;

public class CsvOperation {
    private final String filepath ;


    /**
     * コンストラクタ
     * 処理内容：filePath(処理ファイル)に値をセット
     */
    public CsvOperation(){
        this.filepath = "/Users/ikedashunya/Documents/sukkiri/file/AnimalData.txt" ;
    }

    /**
     * 処理内容：引数なしの場合にコンストラクタで設定したfilePathを引数にしてcsvFileAccessメソッドを呼び出す
     *
     * @return　ArrayList<Animal>aniamals　動物情報のリスト（1行ごとのテキストの内容）
     */
    public ArrayList<Animal> CsvFileSet(){
        return CsvFileReader(this.filepath);
        
    }

    /**
     * 処理内容：引数（ファイル名）がありの場合に、その引数を引数にしてcsvFileAccessメソッドを呼び出す
     *
     * @param fileName　任意のファイル名
     * @return　ArrayList<Animal>aniamals　動物情報のリスト（1行ごとのテキストの内容）
     */
    public ArrayList<Animal> CsvFileSet(String fileName){
        String readFilePath = "/Users/ikedashunya/Documents/sukkiri/file2/" + fileName;
        return CsvFileReader(readFilePath);

    }

    /**
     *処理内容：引数のファイルパスのテキストの内容を1行づつ読み込み、それはAnimal型ArrayListインスタンス加えてreturnする。
     *
     * @param readFilePath　読み込みを行うファイルパス
     * @return　ArrayList<Animal>aniamals　動物情報のリスト（1行ごとのテキストの内容）
     */
    public ArrayList<Animal> CsvFileReader(String readFilePath){
        ArrayList<Animal> aniamals = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(readFilePath));) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalInf = line.split(",");
                Animal animal =new Animal(animalInf[0],animalInf[1],Integer.parseInt(animalInf[2]));
                aniamals.add(animal);
            }
        } catch (IOException ex) {
            // IOException の例外処理
            ex.printStackTrace();
        }
        return aniamals;
    }


    /**
     * 処理内容：引数で受け取ったファイル名に、パスを追加し、「名前,種,歳」となるように、ファイルに書き込む。
     *
     * @param animals　動物情報のリスト（1行ごとのテキストの内容）
     * @param fileName　ファイル名
     * @return　count 書き込みを行った回数（書き込みがおこなわれなかった場合は0）
     */
    public  int CsvFileWriter(ArrayList<Animal> animals, String fileName) {
        int count =0;

        // 書き込むファイルを指定
        String writeFilepath = "/Users/ikedashunya/Documents/sukkiri/file2/" + fileName;
        // try-with-resources 文を使ってファイルを開く
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(writeFilepath));) {
            // 書き込みを繰り返す
            for (Animal animal :animals) {
                bw.write(animal.getName()+"," + animal.getKind()+"," + animal.getAge()); // ファイルに書き込み
                bw.newLine(); // 改行
                count++;
            }
        } catch (IOException e) {
            // IOException の例外処理
            e.printStackTrace();
        }
        
        return count;
    }

}
