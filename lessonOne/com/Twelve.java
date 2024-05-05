package lessonOne.com;

public class Twelve {
	public static void main(String [] args) {
		boolean breakLoop = false;
		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 5; j++) {
		        if (i * j > 10) {
		            System.out.println("Breaking from loop");
		            breakLoop = true;
		            break;
		        }
		    }
		    if (breakLoop) {
		        break;
		    }
		}
	}
}
