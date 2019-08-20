package geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {

	@Test
	void shouldCalculateLengthOfLineStartingAndEndingAtSamePoint() {
		Point p= new Point(3,4);
		Line l = new Line(p,p);
		assertEquals(0.0, l.length());
	}

}
