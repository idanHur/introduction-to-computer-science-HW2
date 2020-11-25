//Idan Hur 318247822
package house;

public class Triangle {
	private Line left;
	private Line right;
	private Line base;

	public Triangle(Line L, Line R, Line B) {
		left = L;
		right = R;
		base = B;
	}

	public Line getLeft() {
		return left;
	}

	public void setLeft(Line left) {
		this.left = left;
	}

	public Line getRight() {
		return right;
	}

	public void setRight(Line right) {
		this.right = right;
	}

	public Line getBase() {
		return base;
	}

	public void setBase(Line base) {
		this.base = base;
	}

	public boolean isTriangle() {
		if (base.getFinish().equels(right.getStart()) && left.getFinish().equels(base.getStart())
				&& right.getFinish().equels(left.getStart())) {
			return true;
		}
		return false;
	}

	public void moveTriangleX(int x) {
		if (this.isTriangle()) {
			if ((base.getFinish().getx() + x) >= 0 && (right.getFinish().getx() + x) >= 0
					&& (left.getFinish().getx() + x) >= 0) {
				left.lineMovex(x);
				right.lineMovex(x);
				base.lineMovex(x);
			}
		}
	}

	public void moveTriangleY(int y) {
		if (this.isTriangle()) {
			if ((base.getFinish().gety() + y) >= 0 && (right.getFinish().gety() + y) >= 0
					&& (left.getFinish().gety() + y) >= 0) {
				left.lineMovey(y);
				right.lineMovey(y);
				base.lineMovey(y);
			}
		}
	}

	public double triangleS() {
		double a = right.length();
		double b = left.length();
		double c = base.length();
		double multiply = ((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b));
		return (Math.sqrt(multiply) / 4);
	}

	public boolean triangleEquals(Triangle T) {
		if (T.base.lineEquals(this.base) && T.left.lineEquals(this.left) && T.right.lineEquals(this.right)) {
			return true;
		}
		return false;
	}

	public String toStringTriangle() {
		return "Right side: " + right.toStringLine() + "\nLeft side: " + left.toStringLine() + "\nBase: "
				+ base.toStringLine() + "\nThe triangle area is: " + triangleS();
	}
}
