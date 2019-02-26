package volatilemodifier;

public class VolatileThread extends Thread {

	private final VolatilePojo volatilePojo;

	public VolatileThread(VolatilePojo volatilePojo) {
		this.volatilePojo = volatilePojo;
	}
	
	@Override
	public void run() {
		System.out.println("Before Thread "+Thread.currentThread().getName()+" Value = "+volatilePojo.getData());
		volatilePojo.setData();
		System.out.println("After Thread "+Thread.currentThread().getName()+" Value = "+volatilePojo.getData());
		
	}

}
