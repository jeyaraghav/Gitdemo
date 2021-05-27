package Singleinheritane;

public class Single2 extends Single1{
	
	public void s2() {
System.out.println("single2");
	}
public static void main(String[] args) {
	Single2 s = new Single2();
	s.s1();
	s.s2();
	
}
}
