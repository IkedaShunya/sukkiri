package file_operation.practice.practice_print01.practice05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvOperation {
	private final String filepath;

	public CsvOperation(String filepath) {
		this.filepath = filepath;
	}

	public ArrayList<Animal> CsvFileReader(){
		ArrayList<Animal> animals = new ArrayList<>();
		String line;
		String[] animalInf;

		try( FileReader fr = new FileReader(filepath);
				BufferedReader br = new BufferedReader(fr); ) {
			
			
			
			while ((line = br.readLine()) != null) {
				animalInf = line.split(",");		
				Animal animal = new Animal(animalInf[0],animalInf[1],Integer.parseInt(animalInf[2]));
				animals.add(animal);
			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();

		}
		
		return animals;


	}





}
