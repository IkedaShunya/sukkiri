package sukkiri.practice.practice_print11.practice02;

public abstract class Category {
	String categoryName;
	
	public Category(String categoryName) {
		this.categoryName = categoryName;
	}
	
	abstract public void displayProductInfo();

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
