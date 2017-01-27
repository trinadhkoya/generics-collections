package practice.generics.fromcompletereference;

public class GenDemo {
	public static void main(String[] args) {

		// create a Gen ref for integer
		Gen<Integer> gen;
		/**
		 * create a gen ref object and assign its ref to gen.
		 */
		gen = new Gen<Integer>(88);

		// call the showType
		gen.showType();
		/**
		 * store the value in some varibale.as it is a integer,sore will be
		 * possible in int only
		 */
		int v = gen.getObj().intValue();

		/**
		 * Create another gen objec which accepts String format now and do the
		 * same as is
		 */
		Gen<String> gen2 = new Gen<String>("Trinadh");
		gen2.showType();
		String v1 = gen2.getObj().toString();
		System.out.println(v);
		System.out.println(v1);


	}

}
