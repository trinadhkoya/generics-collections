package practice.generics.fromcompletereference;

//NonGen is functionally equivalent to Gen
//but does not use generics.
public class NonGen {

	Object object;

	// Pass the constructor a reference to
	// an object of type Objec
	public NonGen(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	public void showType(){
		System.out.println(object.getClass().getName());
	}

}
