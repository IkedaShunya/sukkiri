//package file_operation.practice.practice_print01.practice06;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class CsvOperation {
//	private final String filepath;
//
//	public CsvOperation(String filepath) {
//		this.filepath = filepath;
//	}
//
//	public ArrayList<Animal> CsvFileReader(){
//		this(filepath);
//
//
//	}
//
//	public ArrayList<Animal> CsvFileReader(String fileName){
//
//		String nowFilepath =fileName;
//
//		ArrayList<Animal> animals = new ArrayList<>();
//		String line;
//		String[] animalInf;
//
//		try( FileReader fr = new FileReader(filepath);
//				BufferedReader br = new BufferedReader(fr); ) {
//
//
//			while ((line = br.readLine()) != null) {
//				animalInf = line.split(",");		
//				Animal animal = new Animal(animalInf[0],animalInf[1],Integer.parseInt(animalInf[2]));
//				animals.add(animal);
//			}
//		} catch (IOException ex) {
//			// IOException の例外処理
//			ex.printStackTrace();
//
//		}
//		return animals;
//
//
//
//
//	}
//
//	public int  CsvFileReader(ArrayList<Animal> animals ,String filename){
//		int count =0;
//		String newFilePath = filepath +filename;
//
//		for(Animal animal :animals) {
//			try(FileWriter fw = new FileWriter(newFilePath);
//					BufferedWriter bw = new BufferedWriter(fw);
//					) {
//
//				bw.write("名前:" + animal.getName()); // ファイルに書き込み
//				bw.newLine();// 改行
//				bw.write("種:" + animal.getKind()); // ファイルに書き込み
//				bw.newLine();// 改行
//				bw.write("歳:" + animal.getAge()); // ファイルに書き込み
//				bw.newLine();// 改行
//				
//				count++;
//				
//			} catch (IOException ex) {
//				// IOException の例外処理
//				ex.printStackTrace();
//			}
//			
//			
//
//
//		}
//		return count;
//	}
//
//
//
//
//
//
//}
