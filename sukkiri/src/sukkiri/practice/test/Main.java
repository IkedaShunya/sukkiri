package src.sukkiri.practice.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        CsvOperation csvOperation = new CsvOperation();
        ArrayList<Animal> animals  =  csvOperation.csvFileReader();

        for(Animal animal:animals){
            animal.show();
        }


        String fileName = "test.txt";
        int count =csvOperation.CsvFileWriter(animals, "test.txt");

        if(count ==0){
            System.out.println("書き込みできませんでした");
        }else{
            System.out.println("書き込みました");
        }

        System.out.println("-------------------------------------------");

        animals.clear();
        animals =csvOperation.csvFileReader("test.txt");
        for(Animal animal:animals){
            animal.show();
        }



    }
}
