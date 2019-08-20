package geometry;

public class Line {

	private Point p2;
	private Point p1;

	public Line(Point p1, Point p2) {
		this.p2 = p2;
		this.p1 = p1;
	}

	public double length() {

		return p2.getX() - p1.getX();
	}

}
