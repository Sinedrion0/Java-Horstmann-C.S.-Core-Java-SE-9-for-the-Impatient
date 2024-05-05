package lessonThree.com;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Fourtenn {
	public static void main(String [] args) throws IOException {
		Runnable [] list = new Runnable[] {new LapTop(10),new LapTop(12),new LapTop(65),new LapTop(768),
				new LapTop(30),new LapTop(89),new LapTop(2),new LapTop(50),};
		Thread thread = new Thread(getBackSorted(list));
		thread.start();
		System.out.println(thread.activeCount());
	
		
	}
	public static Runnable getBackSorted(Runnable...r){
		return () -> {
			for(int i = 0; i < r.length; i++) { 
			r[i].run();
			}};
	}
}
class LapTop implements Runnable{
	private int model;
	LapTop(int model){
		this.model = model;
	}
	@Override
	public void run() {
		System.out.println("Model: " + model);
	}
	public int getModel() {return model;}
	
	
}
 