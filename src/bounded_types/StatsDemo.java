package bounded_types;

public class StatsDemo {

	public static void main(String[] args) {

		Integer[] intNums = { 1, 2, 3, 3, 4, 5, 6 };
		Stats<Integer> intStats = new Stats<Integer>(intNums);
		// now it's time to call the average
		double d = intStats.average();
		System.out.println(d);

		Integer[] doubleNums = { 1, 2, 3, 3, 4, 5, 6 };
		Stats<Integer> doubleStats = new Stats<Integer>(doubleNums);
		// now it's time to call the average
		double d1 = doubleStats.average();
		System.out.println(d1);

	}
}
