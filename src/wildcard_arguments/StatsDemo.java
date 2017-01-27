package wildcard_arguments;

public class StatsDemo {
	public static void main(String[] args) {

		Integer[] integers = { 1, 2, 3, 4, 5, 6 };
		Double[] doubles = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
		Stats<Integer> iob = new Stats<Integer>(integers);
		Stats<Double> dob=new Stats<Double>(doubles);
		
		iob.average();
		dob.average();
		
		/**
		 * i am trying to return a value by comparing 
		 * we are passing  double type parametter ,so we have to create a method which accepts only double 
		 * like public boolean sameAvg(Stats<Double> dob) 
		 * sometimes it may be string or sometimes it may be int,so it was little hectic ,so we have an option<?>,it accepts any type
		 * so create a method public boolean sameAvg(Stats<?> dob) 

		 */
		if(iob.sameAvg(dob))
			  System.out.println("Averages are the same.");
			else
			  System.out.println("Averages differ.");
	}

}
