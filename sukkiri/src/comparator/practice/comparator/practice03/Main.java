package comparator.practice.comparator.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Alice", 5000));
		employeeList.add(new Employee("Bob", 60000));
		employeeList.add(new Employee("Charlie", 55000));
		
		// 比較基準のインスタンスを生成し、ソートする
		NameComparator nameComparator = new NameComparator();
		SalaryComparator salaryComparator = new SalaryComparator();
		
		
		
		Collections.sort(employeeList, nameComparator); //昇順
		for (Employee employee : employeeList) { // ソートされたリストを出力
		 System.out.println(employee.toString());
		}
		
		System.out.println("--------------------------------------------");
		
		Collections.sort(employeeList, salaryComparator); //昇順
		for (Employee employee : employeeList) { // ソートされたリストを出力
		 System.out.println(employee.toString());
		}
		
		System.out.println("--------------------------------------------");
		
		Collections.sort(employeeList, Collections.reverseOrder(nameComparator)); //降順
		for (Employee employee : employeeList) { // ソートされたリストを出力
			 System.out.println(employee.toString());
			}
		System.out.println("--------------------------------------------");
		
		Collections.sort(employeeList, Collections.reverseOrder(salaryComparator)); //降順
		for (Employee employee : employeeList) { // ソートされたリストを出力
			 System.out.println(employee.toString());
			}

	}

}
