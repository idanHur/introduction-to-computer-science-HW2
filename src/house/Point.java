//Idan Hur 318247822
package house;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		setx(x);
		sety(y);
	}

	public void setx(int x) {
		if (x >= 0) {
			this.x = x;
		}
	}

	public int getx() {
		return x;
	}

	public void movex(int x) {
		if ((x + this.x) >= 0) {
			this.x = this.x + x;
		}
		System.out.println("cant do this the point is value is under 0");
	}

	public void movey(int y) {
		if ((y + this.y) >= 0) {
			this.y = this.y + y;
		}
		System.out.println("cant do this the point is value is under 0");
	}

	public void sety(int y) {
		if (y >= 0) {
			this.y = y;
		}
	}

	public int gety() {
		return y;
	}

	public boolean equels(Point p) {
		if (p.gety() == y) {
			if (p.getx() == x) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
