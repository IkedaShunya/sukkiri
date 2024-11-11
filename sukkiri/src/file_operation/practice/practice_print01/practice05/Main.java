package file_operation.practice.practice_print01.practice05;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		CsvOperation csvOperation = new CsvOperation("file\\AnimalData.txt");
		ArrayList<Animal> Animals = csvOperation.CsvFileReader();
		
		for(Animal animal :Animals) {
			animal.show();
		}
	}

}
