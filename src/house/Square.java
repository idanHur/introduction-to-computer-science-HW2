//Idan Hur 318247822
package house;

public class Square {
	private Line lower;
	private Line left;
	private Line right;
	private Line upper;

	public Square(Line D, Line L, Line R, Line U) {
		lower = D;
		left = L;
		right = R;
		upper = U;
	}

	public Line getLower() {
		return lower;
	}

	public void setLower(Line lower) {
		this.lower = lower;
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

	public Line getUpper() {
		return upper;
	}

	public void setUpper(Line upper) {
		this.upper = upper;
	}

	public boolean isSquare() {
		if (lower.getFinish().equels(right.getStart()) && right.getFinish().equels(upper.getStart())
				&& upper.getFinish().equels(left.getStart()) && left.getFinish().equels(lower.getStart())) {
			return true;
		}
		return false;
	}

	public void moveSquareX(int x) {
		if (isSquare()) {
			if ((lower.getFinish().getx() + x) >= 0 && (right.getFinish().getx() + x) >= 0
					&& (upper.getFinish().getx() + x) >= 0 && (left.getFinish().getx() + x) >= 0) {
				lower.lineMovex(x);
				right.lineMovex(x);
				left.lineMovex(x);
				upper.lineMovex(x);
			}
		}
	}

	public void moveSquareY(int y) {
		if (isSquare()) {
			if ((lower.getFinish().gety() + y) >= 0 && (right.getFinish().gety() + y) >= 0
					&& (upper.getFinish().gety() + y) >= 0 && (left.getFinish().gety() + y) >= 0) {
				lower.lineMovex(y);
				right.lineMovex(y);
				left.lineMovex(y);
				upper.lineMovex(y);
			}
		}
	}

	public double squareS() {
		double L = left.length();
		double U = upper.length();
		double R = right.length();
		double D = lower.length();
		Line middle = new Line(right.getFinish(), left.getFinish(), null);
		double M = middle.length();
		double triangle1 = (Math.sqrt((D + R + M) * (D + R - M) * (R + M - D) * (M + D - R))) / 4;
		double triangle2 = (Math.sqrt((U + L + M) * (U + L - M) * (L + M - U) * (M + U - L))) / 4;
		return (triangle1 + triangle2);
	}

	public boolean squareEquals(Square S) {
		if (this.left.lineEquals(S.left) && this.right.lineEquals(S.right) && this.upper.lineEquals(S.upper)
				&& this.lower.lineEquals(S.lower)) {
			return true;
		}
		return false;
	}

	public String toStringSquare() {
		return "Right side: " + right.toStringLine() + "\nLeft side: " + left.toStringLine() + "\nUpper base: "
				+ upper.toStringLine() + "\nLower base: " + lower.toStringLine() + "\nThe base area is: " + squareS();
	}
}
