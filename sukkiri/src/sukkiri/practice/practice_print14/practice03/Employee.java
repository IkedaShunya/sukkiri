package sukkiri.practice.practice_print14.practice03;

public class Employee {
	private int id;
	private String name;
	private String dept;

	public  Employee(int id,String name,String dept){
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "社員番号：" +getId()+"、名前："+
				getName()+"、部署：" +dept;

	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Employee e) {
			if(this.id ==e.id && this.name.equals(e.name) && this.dept.equals(e.dept)) {
				System.out.println("a");
				return true;
			}
		}
		return false;


	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}





}
