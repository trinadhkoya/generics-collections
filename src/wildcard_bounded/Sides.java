package wildcard_bounded;

public class Sides<T extends Triangle> {
	
	T[] ts;

	public Sides(T[] ts) {
		this.ts = ts;
	}
	
	

}
