
public class Demo1Pojo implements Comparable<Demo1Pojo> {

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Demo1Pojo o) {
		// TODO Auto-generated method stub
		return ((Integer) o.getId()).compareTo(this.getId());
	}

}
