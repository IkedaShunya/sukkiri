package comparator.practice.comparator.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Alice", 85, 20));
		studentList.add(new Student("Bob", 92, 22));
		studentList.add(new Student("Charlie", 78, 21));
		
		// 比較基準のインスタンスを生成し、ソートする
		StudentComparator studentComparator = new StudentComparator();
		Collections.sort(studentList, studentComparator); //昇順
		for (Student student : studentList) { // ソートされたリストを出力
			 System.out.println(student.toString());
			}
		System.out.println("-----------------------------------------");

		
		studentList.add(new Student("Ray", 78, 19));
		Collections.sort(studentList, studentComparator); //昇順
		for (Student student : studentList) { // ソートされたリストを出力
			 System.out.println(student.toString());
			}
		System.out.println("-----------------------------------------");
		
		Collections.sort(studentList, Collections.reverseOrder(studentComparator)); //降順
		for (Student student : studentList) { // ソートされたリストを出力
			 System.out.println(student.toString());
			}
		//Collections.sort(people, Collections.reverseOrder(ageComparator)); //降順
		
	}

}
