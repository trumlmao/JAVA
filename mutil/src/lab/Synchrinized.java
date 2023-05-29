package lab;

public class Synchrinized {
    public static void main(String[] args) {
        Object lock = new Object(); // đối tượng để đồng bộ hóa giữa 2 luồng
        Thread t1 = new Thread(new WaitThread(lock)); // tạo ra luồng đợi
        Thread t2 = new Thread(new NotifyThread(lock)); // tạo ra luồng thông báo
        t1.start();
        t2.start();
    }
}

class WaitThread implements Runnable {
    private final Object lock;

    public WaitThread(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) { // đồng bộ hóa giữa 2 luồng
            System.out.println("Thread waiting...");
            try {
                lock.wait(0); // đưa luồng hiện tại vào trạng thái chờ đợi và giải phóng khóa của đối tượng hiện tại
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread resumed!");
        }
    }
}
class NotifyThread implements Runnable{
	private final Object lock ;
	public NotifyThread(Object lock) {
		
		try {
			System.out.println(" doi ");
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.lock = lock;
	}
		




    public void run() {
        synchronized (lock) { // đồng bộ hóa giữa 2 luồng
            System.out.println("Thread notifying...");
            lock.notify(); // thông báo cho luồng đang chờ đợi trên đối tượng hiện tại để tiếp tục thực hiện
            System.out.println("Notification sent!");
            }
    
    }
    }