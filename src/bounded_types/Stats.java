package bounded_types;

/**
 * 
 * @author trina
 *
 * @param <T>Stats
 *            attempt to create a generic class that can compute average of
 *            array of numbers This class contains error. 
 *            
 *            The trouble is that
 *            the compiler has no way to know that you are intending to create
 *            Statsobjects using only numeric types
 */

// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number.


/**
 * 
 * @author trina
 *
 * @param <T> type parameter
 * @Number is a Class,even you can extend interface also
 * 
 */
public class Stats<T extends Number> {

	T[] nums;// nums is an array of type T

	// pass the constructor reference to T
	public Stats(T[] nums) {
		this.nums = nums;
	}

	public T[] getNums() {
		return nums;
	}

	public void setNums(T[] nums) {
		this.nums = nums;
	}

	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i].doubleValue();
		}

		return sum/nums.length;
	}
}
