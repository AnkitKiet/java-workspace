import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapIterate {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> cMap = new ConcurrentHashMap<>(); // Replace
																				// with
																				// Map
																				// for
																				// ConcurentModificationException
		cMap.put(1, "Ankit");
		cMap.put(2, "Ankit1");
		cMap.put(3, "Ankit2");
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (Map.Entry<Integer, String> data : cMap.entrySet()) {
					System.out.println("From 1st Thread " + data.getValue());
					if (data.getKey() == 2)
						cMap.put(4, "Added");
				}
			}
		});

		Thread thread_2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (Map.Entry<Integer, String> data : cMap.entrySet()) {
					System.out.println("From 2nd Thread " + data.getValue());
				}
			}
		});
		thread.start();
		thread_2.start();
	}

}
