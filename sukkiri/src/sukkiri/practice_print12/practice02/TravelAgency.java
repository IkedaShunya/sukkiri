package sukkiri.practice_print12.practice02;

public class TravelAgency {
	public void planTrip(Vehicle vehicle) {
		System.out.println("Planning a trip using" + vehicle.getName());
		vehicle.start();
		vehicle.stop();
	}

}
