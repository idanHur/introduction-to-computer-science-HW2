//Idan Hur 318247822
package house;

public class Line {

	private String color;
	private Point start;
	private Point finish;

	public Line(Point p1, Point p2, String color) {
		this.color = color;
		start = p1;
		finish = p2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getFinish() {
		return finish;
	}

	public void setFinish(Point finish) {
		this.finish = finish;
	}

	public void lineMovex(int x) {
		if (((start.getx() + x) >= 0) && ((finish.getx() + x) >= 0)) {
			start.setx(start.getx() + x);
			finish.setx(finish.getx() + x);
		}
	}

	public void lineMovey(int y) {
		if (((start.gety() + y) >= 0) && ((finish.gety() + y) >= 0)) {
			start.sety(start.gety() + y);
			finish.sety(finish.gety() + y);
		}
	}

	public double length() {
		double x = Math.pow((start.getx() - finish.getx()), 2);
		double y = Math.pow((start.gety() - finish.gety()), 2);
		return Math.sqrt((x + y));
	}

	public boolean lineEquals(Line l) {
		if ((l.start.equels(this.start) && l.finish.equels(this.finish)
				|| l.start.equels(this.finish) && l.finish.equels(this.start)) && (l.color.equals(this.color))) {
			return true;
		}
		return false;
	}

	public String toStringLine() {
		return start.toString() + " , " + finish.toString() + " , Color: " + color + " The line length: "
				+ this.length();
	}
}
