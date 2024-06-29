import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {
	@Test
	void testPerimeter() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(2,0);
		Point p3 = new Point(2,5);
		Point p4 = new Point(0,5);
		
		Rectangle r1 = new Rectangle(p1, p2, p3, p4);
		assertEquals(r1.perimeter(), 14);
	}
	
}
