package src.sukkiri.practice.test;

import java.io.*;
import java.util.ArrayList;

public class CsvOperation {
    private final String filepath ;

    public CsvOperation(){
        this.filepath = "/Users/ikedashunya/Documents/sukkiri/file/AnimalData.txt" ;
    }

    public ArrayList<Animal> csvFileReader(){
        return csvFileAccess(this.filepath);
        
    }

    public ArrayList<Animal> csvFileReader(String fileName){
        String readFilePath = "/Users/ikedashunya/Documents/sukkiri/file2/" + fileName;
        return csvFileAccess(readFilePath);

    }

    public ArrayList<Animal> csvFileAccess(String readFilePath){
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
