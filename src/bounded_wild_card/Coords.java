package bounded_wild_card;

public class Coords<T extends TwoD> {
	
	T[] coords;

	public Coords(T[] coords) {
		this.coords = coords;
	}
	
//	static void showXY(Coords<? extends ThreeD>  c){
//		System.out.println("Show X Y Z Co ordinates");
//		for (int i = 0; i < c.coords.length; i++) {
//			
//			System.out.println();
//		}
//	}

}
