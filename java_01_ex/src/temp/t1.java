package temp;

public class t1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Point p = new Point(1, 1);
		
		System.out.println(p);
		Point p1 = p.clone();
		p1.setX(9);
		System.out.println(p1);
	}
}

class Point implements Cloneable {
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	protected Point clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Point)super.clone();
	}
}