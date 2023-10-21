
public class thread extends Thread {
    private int exe;

    public thread(int exe) {
        this.exe = exe;
    }

    public void run() {
        try {
            System.out.println("Thread "  + exe + " has started");
            Thread.sleep(10000);
            System.out.println("Thread " + exe + " has finished Running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
