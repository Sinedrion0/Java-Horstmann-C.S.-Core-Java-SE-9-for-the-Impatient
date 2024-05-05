package lessonFour.com;

public class Four {
	public static void main(String[] args) {
		creatingClass(new Circle(new Point(150.34, 100.23), 3.05));
		creatingClass(new Rectangle(new Point(150.34, 100.23), 12.5,7.05));
		creatingClass(new Line(new Point(150.34, 100.23), new Point(300.045, 300.87)));
		
	}
	public static void creatingClass(Shape object) {
		System.out.println(object.getCenter());
		object.moveBy(100.02, -50.03);
		System.out.println(object.getCenter());
	}
}

abstract class Shape {
	private Point point;
	public Shape(double x, double y) {
		point = new Point(x,y);
	}
	public void moveBy(double x, double y) {
		point = new Point(point.getX()+x,point.getY()+y);
	}
	abstract public Point getCenter();
}

class Circle extends Shape{
	private Point localPoint;
	private double radius;
	Circle(Point p, double radius){
		super(p.getX(), p.getY());
		localPoint = p;
	}
	@Override
	public Point getCenter() {
		return this.localPoint;
	}
	@Override
	public void moveBy(double x, double y) {
		localPoint = new Point(localPoint.getX()+x,localPoint.getY()+y);
	}
	public String showDimension() {
		return "radius: " + radius;
	}
}

class Rectangle extends Shape{
	private Point localPoint;
	private double width;
	private double height;
	Rectangle(Point p, double width, double height){
		super(p.getX(), p.getY());
		this.width = width;
		this.height = height;
		localPoint = p;
	}
	@Override
	public Point getCenter() {
		return this.localPoint;
	}
	@Override
	public void moveBy(double x, double y) {
		localPoint = new Point(localPoint.getX()+x,localPoint.getY()+y);
	}
	public String showDimension() {
		return "width: " + width + " height: " + height;
	}
}

class Line extends Shape{
	private Point localPoint;
	private Point localSecondPoint;
	Line(Point from, Point to){
		super(from.getX(), from.getY());
		localPoint = from;
		localSecondPoint = to;
	}
	@Override
	public Point getCenter() {
		return this.localPoint;
	}
	@Override
	public void moveBy(double x, double y) {
		localPoint = new Point(localPoint.getX()+x,localPoint.getY()+y);
	}
	public Point showDimension() {
		return localSecondPoint;
	}
}




