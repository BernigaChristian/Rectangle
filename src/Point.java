
public class Point {
	private double x;
	private double y;
	//constructors
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public Point() {
		this.x=0;
		this.y=0;
	}
	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
	}
	//getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	//setters
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	//methods
	public double distance(Point p) {
		return Math.sqrt(Math.pow((p.x-x),2)+Math.pow((p.y-y),2));					
	}
	
}
