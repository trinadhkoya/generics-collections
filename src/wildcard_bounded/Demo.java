package wildcard_bounded;

public class Demo {
	
	public static void main(String[] args) {
		
		Triangle[] triangles={new Triangle(1, 2, 3),new Triangle(1, 2, 3),new Triangle(3, 4, 5)};
		Square[]   squares={new Square(1, 2, 3, 4),new Square(2, 1, 2, 4),new Square(2, 3, 2, 3)};
		Pentagon[] pentagons={new Pentagon(1, 2, 3, 4, 5),new Pentagon(2, 5, 7, 6, 7)};
		Hexagon[] hexagons={new Hexagon(1, 2, 3, 3, 4, 5),new Hexagon(1, 3, 5, 5, 6, 6)};
		
		
		Sides<Triangle> sidesTr=new Sides<Triangle>(triangles);
		Sides<Square> sidesSqu=new Sides<Square>(squares);
		Sides<Pentagon> sidesPent=new Sides<Pentagon>(pentagons);
		Sides<Hexagon> sidesHex=new Sides<Hexagon>(hexagons);
		
		showTrinagleSides(sidesTr);
		showSquareSides(sidesSqu);
		showPentagon(sidesPent);
		
		
		
		
		
		
		
		
	}
	
	
	static void showTrinagleSides(Sides<?> trsides){
		System.out.println("SHOW A B C");
		for (int i = 0; i <trsides.ts.length; i++) {
			System.out.println(trsides.ts[i].a+" "+trsides.ts[i].b+" "+trsides.ts[i].c);
		}
		
	}
	
	
	static void showSquareSides(Sides<? extends Square> sqsides){
		System.out.println("SHOW A B C D E");
		for (int i = 0; i < sqsides.ts.length; i++) {
			System.out.println(sqsides.ts[i].a+" "+sqsides.ts[i].b+" "+sqsides.ts[i].c+" "+sqsides.ts[i].d);

		}
	}
	
	static void showPentagon(Sides<? extends Pentagon> pentasides){
		System.out.println("SHOW A B C D E F");
		for (int i = 0; i < pentasides.ts.length; i++) {
			System.out.println(pentasides.ts[i].a+" "+pentasides.ts[i].b+""+pentasides.ts[i].c+" "+pentasides.ts[i].d+""+pentasides.ts[i].e);
		}
	}
	
	
	static void showHexagon(Sides<? extends Hexagon> hexsides){
		System.out.println("SHOW A B C D E F G");
		for (int i = 0; i < hexsides.ts.length; i++) {
			System.out.println(hexsides.ts[i].a+" "+hexsides.ts[i].b+" "+hexsides.ts[i].c+" "+hexsides.ts[i].d+" "+hexsides.ts[i].e+" "+hexsides.ts[i].f);
		}		
		
	}
	
	

}
