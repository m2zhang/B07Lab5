public class Circle {
	
	double radius;
	
	Point center;
	
	public Circle(double r, Point c) {
		this.radius = r;
		
		this.center = c;
	}
	
	public double perimeter() {
		return 2* Math.PI * radius;
	
	}

	
}