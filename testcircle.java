import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testcircle {

	@Test
	void testPerimeter() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(3.0, p1);
		Circle c2 = new Circle(0.0, p1);
		Circle c3 = new Circle(2.8, p1);
		
		double x1 = c1.perimeter();
		assertEquals(x1, 6.0 * Math.PI);
		double x2 = c2.perimeter();
		assertEquals(x2, 0.0);
		double x3 = c3.perimeter();
		assertEquals(x3, 5.6 * Math.PI);
		
	}
}