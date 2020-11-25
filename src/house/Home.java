//Idan Hur 318247822
package house;

public class Home {
	private Triangle roof;
	private Square base;

	public Home(Triangle T, Square B) {
		roof = T;
		base = B;
	}

	public Triangle getRoof() {
		return roof;
	}

	public void setRoof(Triangle roof) {
		this.roof = roof;
	}

	public Square getBase() {
		return base;
	}

	public void setBase(Square base) {
		this.base = base;
	}

	public boolean isHome() {
		if (roof.getBase().lineEquals(base.getUpper()) && roof.getRight().getColor().equals("red")
				&& roof.getLeft().getColor().equals("red")) {
			return true;
		}
		return false;
	}

	public void moveHouseX(int x) {
		if (isHome()) {
			roof.moveTriangleX(x);
			base.moveSquareX(x);
		}
	}

	public void moveHouseY(int y) {
		if (isHome()) {
			roof.moveTriangleY(y);
			base.moveSquareY(y);
		}
	}

	public double houseArea() {
		return (roof.triangleS() + base.squareS());
	}

	public boolean homeEquals(Home H) {
		if (this.base.squareEquals(H.base) && this.roof.triangleEquals(H.roof)) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "The roof is: \n" + roof.toStringTriangle() + "\nThe base is: \n" + base.toStringSquare()
				+ "\nThe house area is: " + houseArea();
	}

}
