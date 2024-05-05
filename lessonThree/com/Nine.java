package lessonThree.com;

public class Nine {
	 public static void main(String[] args) {
		 twoThreads(new Greeter("IBM", 12), new Greeter("Google",20));
	 }
	 public static void twoThreads(Runnable first, Runnable second) {
		 new Thread(first).run();
		 new Thread(second).run();
	 }
}


class Greeter implements Runnable {
	private String targetName;
	private int counter;
	Greeter(String targetName, int counter){
		this.targetName = targetName;
		this.counter = counter;
	}
	@Override
	public void run() {
		while(this.counter > 0)
		System.out.println("Hello " + this.targetName + " Counter: " + this.counter--);
		
	}}
