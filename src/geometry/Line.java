package geometry;

public class Line {

	private Point p2;
	private Point p1;

	public Line(Point p1, Point p2) {
		this.p2 = p2;
		this.p1 = p1;
	}

	public double length() {
		double res = 0.0;
		res = Math.sqrt(Math.pow((p2.getY()-p1.getY()), 2)+Math.pow((p2.getX()-p1.getX()), 2));
		return res;
	}

}
