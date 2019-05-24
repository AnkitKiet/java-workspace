import java.util.logging.Logger;

public class ThreadDemo1 {
    private static final Logger LOGGER = Logger.getLogger(ThreadDemo1.class.getName());

	public static void main(String[] args) {
        LOGGER.info("Logger Name: "+LOGGER.getName());
        LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");

		Runnable runnable = () -> {
			 LOGGER.info("Hello with Thread " + Thread.currentThread().getName());
		};
		
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
