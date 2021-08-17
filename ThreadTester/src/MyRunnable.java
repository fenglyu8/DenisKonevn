public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    private void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        doMore();
    }

    private void doMore() {
        System.out.println("top of the stack");
    }
}
