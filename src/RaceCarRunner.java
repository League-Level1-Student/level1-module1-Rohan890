

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar honda = new RaceCar("Honda", 5);
		// 2. Print the RaceCar's position in the race
System.out.println(honda.getPositionInRace());
		// 3. Crash the RaceCar
honda.crash();		
		// 4. If the car is damaged. Bring it in for a pit stop.
if(honda.damaged) {
	honda.pit();
}
		// 5. Help the car move into first place.
honda.overtake();
honda.overtake();
honda.overtake();
	}
}
