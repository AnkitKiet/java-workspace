
public class SwapReference {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("4");
		StringBuilder b = new StringBuilder("10");
		changeValue(a,b);
		System.out.println(a+"--"+b);
	}

	private static void changeValue(StringBuilder a, StringBuilder b) {
		StringBuilder temp=new StringBuilder();
		temp.insert(0, a);
		a.replace(0,a.length(),b.toString());
		b.replace(0, b.length(), temp.toString());
	}


}
