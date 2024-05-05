package lessonThree.com;

public class Ten {
	 public static void main(String... args) throws Exception {
		 runTogether(()->System.out.println(Thread.currentThread().getName() + " r1"),
			()-> System.out.println(Thread.currentThread().getName() + " r2"));

		 System.out.println(" ");
		 
		 runInOrder(()-> System.out.println(Thread.currentThread().getName() + " r3"),
				 ()->System.out.println(Thread.currentThread().getName() + " r4"));
	 }
	 public static void runTogether(Runnable ... runnables ) {
		 for(Runnable r : runnables)
			 new Thread(r).start();
		}
	 
	 public static void runInOrder(Runnable ... runnables ) {
		 	for (Runnable r : runnables)
		 		r.run();
			}
	 }

/// Запустить код не через main а через мой поток


