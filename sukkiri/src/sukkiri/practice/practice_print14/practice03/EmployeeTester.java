package sukkiri.practice.practice_print14.practice03;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee[] emps = new Employee[3];

		emps[0] = new Employee(101,"ドラえもん","営業部");
		emps[1] = new Employee(201,"のび太","総務部");
		emps[2] = new Employee(202,"スネ夫","総務部");

		Employee nobita = new Employee(201,"のび太","総務部");
		boolean match = false;
		for(Employee emp : emps) {
			emp.toString();
			if(emp.equals(nobita)) {
				match = true;
			}

		}
		
		if(match) {
			System.out.println("データが存在します。");
		}else {
			System.out.println("データが存在しません。");
		}

		
	}

}
