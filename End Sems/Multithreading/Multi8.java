public class Multi8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            Thread thread = new NumberDisplayThread(i);
            thread.start();
        }
    }
}
class NumberDisplayThread extends Thread {
    private int threadNumber;
    public NumberDisplayThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Thread " + threadNumber + " - Number: " + i);
        }
    }
}
