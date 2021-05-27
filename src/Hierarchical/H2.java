package Hierarchical;

public class H2 extends H1 {
	public void hi2() {
		System.out.println("hi2");
	}
public static void main(String[] args) {
	H2 hh = new H2();
	hh.hi1();
	hh.hi2();
}
}
