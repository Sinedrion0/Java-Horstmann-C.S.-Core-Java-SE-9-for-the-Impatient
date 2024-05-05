package lessonFour.com;

import javax.print.attribute.standard.MediaSize.Other;

public class One {
	 public static void main(String[] args) {
		LabelPoint p = ((LabelPoint)createPoint("Push",12.5,-34.054));
		LabelPoint lp = new LabelPoint("Push",12.5,-34.054);
		lp.x = 45.12312;
		System.out.println(p.getX() + " " + p.getY() + " "+ p.getLabel() + p.getX() + " " + p.getY());
	 }
	 public static Point createPoint(String label, double x, double y) {
		 return new LabelPoint(label, x, y);
	 }
}
 class Point {
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	protected double x;
	protected double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
}

 class LabelPoint extends Point{
	
	private String label;
	
	public LabelPoint(String label, double x, double y) {
		super(x, y);
		this.label = label;
	}
	public String getLabel() {
		x = 0.5;
		y = 0.23;
		return this.label;
	}
	
}