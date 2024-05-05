package lessonsTwo.com;

public class Six {
	private int x;
	private int y;
	
	Six () {
		x = 0;
		y = 0;
		}
	Six (int x, int y) {
		this.x = x;
		this.y = y;
		}
	
	public int getX () {
		return this.x;
	}
	public int getY () {
		return this.y;
	}
	public Five translate (int x, int y) {
		this.x += x;
		this.y += y;
		return new Five(this.x,this.y);
	}
	public Five scale (double f) {
		this.x *= f;
		this.y *= f;
		return new Five(this.x,this.y);
	}
	
	public static void main(String [] args) {
		Five five = new Five(4,8);
		System.out.println("x: " + five.getX() + " y: " + five.getY());
		five.translate(6, 6);
		System.out.println("x: " + five.getX() + " y: " + five.getY());
		five.scale(0.3);
		System.out.println("x: " + five.getX() + " y: " + five.getY());
		Five six = new Five(1,3).translate(3, 5).scale(0.5);
		System.out.println("x: " + six.getX() + " y: " + six.getY());
	}
}
