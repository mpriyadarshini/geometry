package geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {

	@Test
	void shouldCalculateLengthOfLineStartingAndEndingAtSamePoint() {
		Point p = new Point(3, 4);
		Line l = new Line(p, p);
		assertEquals(0.0, l.length());
	}

	@Test
	void shouldCalculateLengthOfLineParallelToXAxisInFirstQuadrant() {
		Point p = new Point(3, 0);
		Point origin = new Point(1, 0);
		Line l = new Line(origin, p);
		assertEquals(2.0, l.length());
	}
	
	@Test
	void shouldCalculateLengthOfLineParallelToYAxisInFirstQuadrant() {
		Point p = new Point(0, 3);
		Point origin = new Point(0, 1);
		Line l = new Line(origin, p);
		assertEquals(2.0, l.length());
	}
	@Test
	void shouldCalculateLengthOfLineParallelToYAxisWithPointReversed() {
		Point p = new Point(1, 3);
		Point origin = new Point(-1, 2);
		Line l = new Line(origin, p);
		assertEquals(2.0, l.length());
	}
	@Test
	void shouldCalculateLengthOfLineParallelToXAxisWithPointReversed() {
		Point p = new Point(4, 1);
		Point origin = new Point(-2, 1);
		Line l = new Line(origin, p);
		assertEquals(6.0, l.length());
	}

}
