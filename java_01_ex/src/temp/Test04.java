package temp;

public class Test04 {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(5, 5), 3);
		//System.out.println(c1);
		
		Circle c2 = c1.clone();
		
		c1.p.setX(99);
		System.out.println(c1);
		System.out.println(c2);

	}
}

class Circle implements Cloneable{
	Point p;
	double r;
	
	public Circle() {	}
	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
	@Override
	protected Circle clone() {
		Circle c = null;
		try {
			c = (Circle) super.clone();
			Point p = c.p.clone();
			c.p = p;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	
	
}