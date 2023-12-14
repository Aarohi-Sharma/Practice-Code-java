class MultithreadingDemo1 implements Runnable {
    public void run()
    {
        try {
            System.out.println( "Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
class Multi6 {
    public static void main(String[] args)
    {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new MultithreadingDemo1());
            object.start();
        }
    }
}
