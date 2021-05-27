package OverRiding;

public class Overriding2 extends Overriding1 {
	public void a2() {
System.out.println("4");
	}
public void a5() {
System.out.println("5");
}
public void a6() {
System.out.println("6");
}
public static void main(String[] args) {
	Overriding2 d = new Overriding2();
	d.a1();
	d.a2();
	d.a3();
	d.a5();
	d.a6();
}
}
