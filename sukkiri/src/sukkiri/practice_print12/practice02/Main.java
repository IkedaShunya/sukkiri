package sukkiri.practice_print12.practice02;

public class Main {
	public static void main(String[] args) {
		TravelAgency travelAgency = new TravelAgency();
		Car car = new Car("Toyota");
		Bicycle bicycle = new Bicycle("Mountain Bike");
		
		
		
		travelAgency.planTrip(car);
		System.out.println("------------------------");
		travelAgency.planTrip(bicycle);
		
		
	}

}
