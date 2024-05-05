package lessonsTwo.com;

/**
 * This's five exercie for Horstaman's book 
 * i don't know what to say
 * @author Denis
 * @version first 1st
 *
 * 
 */

public class Five {

	
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
	/**
	 * It's the result varriable
	 */
	boolean result = true;

	private int x;
	private int y;
	Five () {
		x = 0;
		y = 0;
		}
	
	Five (int x, int y) {
		this.x = x;
		this.y = y;
		}
	/**
	 * {@link Five#x}
	 * @return this method return x variable so called getter
	 */
	public int getX () {
		return this.x;
	}
	
	/**
	 * The getY method / it was written by me
	 * 
	 */
	public int getY () {
		return this.y;
	}
	
	/**
	 * 
	 * @param f it's double value on which x and y gonna be multiply
	 * @return class that called this method
	 * @throws some bulshit
	 */
	public Five scale (double f) {
		this.x *= f;
		this.y *= f;
		return this;
	}
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Five translate (int x, int y) {
		this.x += x;
		this.y += y;
		return this;
	}
}
