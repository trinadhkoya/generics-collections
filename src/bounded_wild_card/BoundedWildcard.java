package bounded_wild_card;

public class BoundedWildcard {

	static void showXY(Coords<?> c) {
		System.out.println("X Y Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
		System.out.println();
	}

	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("X Y  ZCoordinates:");
		for (int i = 0; i < c.coords.length; i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
		System.out.println();
	}

	static void showAll(Coords<? extends FourD> c) {
		System.out.println("X Y Z T Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
		System.out.println();
	}

	public static void main(String[] args) {

		TwoD[] td = { new TwoD(0, 0), new TwoD(0, 1), new TwoD(1, 2) };

		Coords<TwoD> coords = new Coords<TwoD>(td);
		showXY(coords);

		ThreeD[] threeD = { new ThreeD(1, 2, 3), new ThreeD(1, 2, 3), new ThreeD(1, 2, 3) };

		Coords<ThreeD> coords1 = new Coords<ThreeD>(threeD);
		showXYZ(coords1);

		FourD[] fourDs = { new FourD(1, 2, 3, 4) };
		Coords<FourD> coords2 = new Coords<FourD>(fourDs);
		showAll(coords2);

	}

}