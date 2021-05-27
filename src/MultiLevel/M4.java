package MultiLevel;

public class M4 extends M3 {
	public void ml4() {
		System.out.println("ml4");
	}
	public static void main(String[] args) {
		M4 w = new M4();
		w.ml1();
		w.ml2();
		w.ml3();
		w.ml4();
	}
}
