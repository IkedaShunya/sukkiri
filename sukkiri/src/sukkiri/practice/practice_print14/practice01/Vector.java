package sukkiri.practice.practice_print14.practice01;

public class Vector {
	double x;
	double y;
	
	public Vector(double x,double y) {
		this.x = x;
		this.y = y;
	
	}
	
	@Override
	public String toString() {
		String resutlt = "Vector: Vector(" + this.x +","+ this.y +")";
		return resutlt;
		
	}

}
