package params;

/**
 * 
 * @author trina A simple generic class with two type params T and V
 *
 */
public class TwoGen<T, V> {

	T obj1;
	V obj2;

	// Pass the constructor a reference to
	// an object of type T and an object of type V.
	public TwoGen(T o1, V o2) {
		this.obj1 = o1;
		this.obj2 = o2;
	}

	void showTypes() {
		System.out.println("Type of T is " + obj1.getClass().getCanonicalName());
		System.out.println("Type of V is" + obj2.getClass().getCanonicalName());

	}

	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public V getObj2() {
		return obj2;
	}

	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}
	
	
	

}
