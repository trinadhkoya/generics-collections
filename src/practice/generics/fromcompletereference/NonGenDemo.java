package practice.generics.fromcompletereference;

/**
 * 
 * @author trina by using ths kind of things ,Run time exceptions are no known
 *         to us Cast things to be implemnted
 *
 */

public class NonGenDemo {

	public static void main(String[] args) {
		// Create NonGen Object and store
		NonGen gen;
		// an Integer in it. Autoboxing still occurs
		gen = new NonGen(88);
		// Show the type of data used by gen.
		gen.showType();
		// Get the value of gen.
		// This time, a cast is necessary.
		/**
		 * when we call getObject ,The return type is Object But we need it in
		 * terms of Integer ,so we have to cast
		 */
		int v = (int) gen.getObject();
		System.out.println("value: " + v);
		// Create another NonGen object and
		// store a String in it.
		NonGen gen2 = new NonGen("Non-Genric Test");
		// Show the type of data used by gen2.
		/**
		 * in this also,we have to get the object in terms of String and Cast
		 * need to be done
		 */
		gen2.showType();
		// This time also, a cast is necessary.
		String v1 = (String) gen2.getObject();

		gen = gen2;// This compiles, but is conceptually wrong!
		v = (Integer) gen.getObject();
	}
}
