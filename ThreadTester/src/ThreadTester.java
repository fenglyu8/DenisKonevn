public class ThreadTester {

    public static void main(String[] args) {
	    while (true) {
            Runnable threadJob = new MyRunnable();
            Thread myThread = new Thread(threadJob);
            myThread.start();
            System.out.println("back to main");
        }
    }
}
