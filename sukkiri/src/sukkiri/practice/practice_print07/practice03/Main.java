package sukkiri.practice.practice_print07.practice03;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Kate", "Jones", 27, "医者");
		Person person2 = new Person("John", "Christopher", "Smith", 65, "教師");
		
		//
		person1.showProfile();
		System.out.println();
		System.out.println("-------------------------------");
		person2.showProfile();
		System.out.println();
		System.out.println("-------------------------------");
		person1.setJob("獣医");
		System.out.println("person1の仕事を"+person1.getJob()+"に変更しました");
		person1.showProfile();
	}

}
