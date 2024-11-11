package sukkiri.practice.test;

import java.util.ArrayList;

import file_operation.practice_print06.CsvOperation;

public class Main {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        CsvOperation csvOperation = new CsvOperation();
        ArrayList<Animal> animals  =  csvOperation.CsvFileSet();

        /**
         * 処理内容：引数なしのメソッドを用いてCSVファイルの呼び出しを行い、全件表示する。
         */
        for(Animal animal:animals){
            animal.show();
        }

        //書き出しを行うファイル名の指定
        String writeFileName = "test.txt";
        //書き出し処理の実施。
        int count =csvOperation.CsvFileWriter(animals, writeFileName);
        if(count ==0){
            System.out.println("書き込みできませんでした");
        }else{
            System.out.println("書き込みました");
        }

        System.out.println("-------------------------------------------");

        //↑で書き出したファイルの内容を表示
        animals.clear();
        animals =csvOperation.CsvFileSet(writeFileName);
        for(Animal animal:animals){
            animal.show();
        }



    }
}
