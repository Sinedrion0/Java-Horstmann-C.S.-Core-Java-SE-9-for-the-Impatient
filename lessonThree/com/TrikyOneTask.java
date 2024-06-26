package lessonThree.com;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// 1)In the Future figure it out why every time i run this program tom and tim change their 
//     positions to each other
// 2) why program doesn't exit itself
public class TrikyOneTask {
	private final ReentrantLock lock = new ReentrantLock();

    public static void main(String... args) throws Exception {
        var app = new TrikyOneTask();
        var es = Executors.newFixedThreadPool(2);
        es.submit(app.new Greeter(10,"tom"));
        es.submit(app.new Greeter(5, "tim"));
        es.awaitTermination(2000, TimeUnit.MILLISECONDS);
        System.out.println(Thread.activeCount());
    }

    private class Greeter implements Runnable {
        private final int n;
        private final String target;

        public Greeter(int n, String target) {
            this.n = n;
            this.target = target;
        }
        
        @Override
        public void run() {
            for (var i = 0; i < this.n; i++) {
            	//TrikyOneTask.this.lock.lock();
                System.out.println("Hello, " + this.target);
              //   TrikyOneTask.this.lock.unlock();
            }
        }
    }
    
}
