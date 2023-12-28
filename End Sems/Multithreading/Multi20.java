class Customer {
    int balance = 10000;
    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw...");
        while (balance < amount) {
            System.out.println("Not enough balance; waiting for a deposit...");
            try {
                wait(); // The withdrawer waits for a deposit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawal completed...");
    }
    synchronized void deposit(int amount) {
        System.out.println("Going to deposit...");
        balance += amount;
        System.out.println("Deposit completed.");
        notify(); // Notify the waiting thread (withdrawer)
    }
}
class Multi20 {
    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000); 
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000); 
            }
        }.start();
    }
}
