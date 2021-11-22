import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Rectangle r[]=new Rectangle[4];
		//istantiation
		for(int i=0;i<r.length;i++) {
			r[i]=new Rectangle(new Point(1+i,8-i),new Point(2-i,4+i),new Point(5+i,11+i),new Point(7-i,8-i));
		}
		//test getters
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i].getBase()+" "+r[i].getHeight()+" "+r[i].perimeter()+" "+r[i].area());
		}
		//test toString
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i].toString());
		}
	}

}
