import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Demo1Pojo> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Demo1Pojo obj = new Demo1Pojo();
			obj.setId(i);
			obj.setName("Ankit " + i);
			list.add(obj);
		}
		System.out.println("Print before Sort");
		for (Demo1Pojo o : list) {
			System.out.println(o.getId());
		}
		System.out.println("Print after Sort");
		Collections.sort(list);
		for (Demo1Pojo o : list) {
			System.out.println(o.getId());
		}
	}

}
