package comparator.practice.comparator.practice03;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// 例: 年齢を比較する場合
		return Double.compare(employee1.getSalary(), employee2.getSalary());
	}
}
