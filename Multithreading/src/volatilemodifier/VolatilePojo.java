package volatilemodifier;

public class VolatilePojo {

	private volatile int counter;

	public int getData() {
		return counter;
	}

	public void setData() {
		++counter;
	}

}
