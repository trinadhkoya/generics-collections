package practice.generics.fromcompletereference;

/**
 * @author trina
 *
 * @param <T>
 *            type parameter
 * 
 */
public class Gen<T> {

	/**
	 * We are declaring an object for class T. if type String is passed to T,
	 * then in that instance, obj will be of type String .
	 */
	T obj;

	/**
	 * 
	 * @param tis of type T. 
	 * Actual type of t is determined by type passed to
	 * T when Gen object cretaed
	 */
	public Gen(T t) {
		this.obj = t;
	}

	/**
	 * 
	 * @return obj of type T
	 * T may be either Integer or String or any Othe Class
	 *
	 */
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	void showType() {
		System.out.println("Type of T is " + obj.getClass().getName());
	}
}
