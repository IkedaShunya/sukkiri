package comparator.practice.comparator.practice02;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// まずは成績で比較し、差があればその差を返し、
		//成績が等しければ年齢の差を返す。
		
		if(s1.getScore() ==s2.getScore()) {
			return s1.getAge()- s2.getAge();
					
		}
		return s1.getScore() - s2.getScore();
		
	}
	

}
