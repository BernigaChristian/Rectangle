import java.util.Random;
public class Rectangle {
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	//constructors
	public Rectangle(Point p1,Point p2,Point p3,Point p4) {
		this.p1=p1; //oppure this.p1=new Point(p1);
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
	}
	public Rectangle() {
		this.p1=new Point(new Random().nextInt(15),new Random().nextInt(20));
		this.p2=new Point(new Random().nextInt(15),new Random().nextInt(20));
		this.p3=new Point(new Random().nextInt(15),new Random().nextInt(20));
		this.p4=new Point(new Random().nextInt(15),new Random().nextInt(20));
	}
	public Rectangle(Rectangle r) {
		this.p1=new Point(r.getP1().getX(),r.p1.getY());
		this.p2=new Point(r.p2.getX(),r.p2.getY());
		this.p3=new Point(r.p3.getX(),r.p3.getY());
		this.p4=new Point(r.p4.getX(),r.p4.getY());
	}
	//getters
	public double getXP1() {
		return p1.getX();
	}
	public double getXP2() {
		return p2.getX();
	}
	public double getXP3() {
		return p3.getX();
	}
	public double getXP4() {
		return p4.getX();
	}
	public double getYP1() {
		return p1.getY();
	}
	public double getYP2() {
		return p2.getY();
	}
	public double getYP3() {
		return p3.getY();
	}
	public double getYP4() {
		return p4.getY();
	}
	public double getBase() {
		return p1.distance(p2);
	}
	public double getHeight() {
		return p2.distance(p3);
	}
	//best getters
	public Point getP1() {
		return p1;
	}
	public Point getP2() {
		return p2;
	}
	public Point getP3() {
		return p3;
	}
	public Point getP4() {
		return p4;
	}
	//alternative getters
	public double getPointX(int i) {
		switch(i) {
		case 1: return p1.getX();
		case 2: return p2.getX();
		case 3: return p3.getX();
		case 4: return p4.getX();
		default:
			return -1;
		}
	}
	public double getPointY(int i) {
		switch(i) {
		case 1: return p1.getY();
		case 2: return p2.getY();
		case 3: return p3.getY();
		case 4: return p4.getY();
		default:
			return -1;
		}

	}
	//setters
	
	//methods
	public double perimeter() {
		return (2*p1.distance(p2))+(2*p2.distance(p3));
	}
	public double area() {
		return p1.distance(p2)*p2.distance(p3);
	}
	public String toString() {
		return "BASE: "+p1.distance(p2)+"\tHEIGHT: "+p2.distance(p3)+"\tPERIMETER: "+perimeter()+"\tAREA: "+area();
	}
}
