
public class TestId {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			ThreadDemo td = new ThreadDemo();
			td.setName("Thread " + i);
			td.start();
		}
	}

}

class ThreadDemo extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Thread Id - " + this.getId() + "Thread Name --" + this.getName());
	}

}
