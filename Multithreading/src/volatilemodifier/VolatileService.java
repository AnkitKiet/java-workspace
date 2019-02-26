package volatilemodifier;

public class VolatileService {

	public static void main(String[] args) {
		VolatilePojo volatilePojo = new VolatilePojo();
		Thread[] threadObj = new Thread[2];
		for (int i = 0; i < 2; ++i) {
			threadObj[i] = new VolatileThread(volatilePojo);
		}
		for (int i = 0; i < 2; ++i) {
			threadObj[i].start();
		}
		
		for (int i = 0; i < 2; ++i) {
			try {
				threadObj[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
