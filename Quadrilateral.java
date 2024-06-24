public class Quadrilateral {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Quadrilateral(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	public boolean isSqaure() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDA = D.distance(A);
		if(dAB==dBC && dBC==dCD && dCD==dDA)
			return true;
		else
			return false;
	}

	public boolean isRectangle() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDA = D.distance(A);
		if(dAB==dCD && dBC==dDA)
			return true;
		else
			return false;
	}
}
