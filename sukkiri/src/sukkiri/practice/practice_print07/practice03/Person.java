package sukkiri.practice.practice_print07.practice03;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String job;

	
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	
	//コンストラクタ
	public Person(String firstName,String lastName,int age,String job) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.job = job;	
	}
	public Person(String firstName,String middleName ,String lastName,int age,String job) {
		this(firstName, lastName, age, job);
		this.middleName =middleName; 
	}
	
	/*
	 * フルネームをセットするメソッド
	 * ミドルネームがない場合は、firstName + lastName
	 * ある場合はgetFirstName() + getMiddleName() + getLastName()
	 */
	public String fullName() {
		if(middleName == null) {
			return getFirstName() + getLastName();
		}else {
			return getFirstName() + getMiddleName() + getLastName();
		}
	}
	
	public void showProfile() {
		System.out.println("私の名前は" + fullName() +"です");
		System.out.println("年齢は" + getAge() + "です。");
		System.out.println("仕事は"+ getJob() +"です");
	}
	
	
	
}
