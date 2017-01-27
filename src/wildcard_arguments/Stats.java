package wildcard_arguments;

public class Stats<T extends Number> {

	T[] ts;

	public Stats(T[] ts) {
		this.ts = ts;
	}

	public T[] getTs() {
		return ts;
	}

	public void setTs(T[] ts) {
		this.ts = ts;
	}

	double average() {
		double sum=0.0;
		for (int i = 0; i < ts.length; i++) {
			sum+=ts[i].doubleValue();
		}
		return sum/ts.length ;

	}

	public boolean sameAvg(Stats<?> dob) {
		if(average()==dob.average()){
			return true;
		}
		
		return false;
	}
	
	
/**
 * I tried 
 */
//	public boolean sameAvg(Stats<T> stats) {
//		
//		if(average()==stats.average()){
//			return true;
//		}
//		return false;
//	}
}
