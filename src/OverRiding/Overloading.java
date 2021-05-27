package OverRiding;

public class Overloading {
	
	public void test1(String a ) {
System.out.println("String "+a);
	}
public void test2(int b, char c) {
System.out.println("int "+b+" char "+c);
}
public void test3(long d, float e,boolean f) {
	System.out.println("long "+d+" float "+e+" boolean "+f);

}
public static void main(String[] args) {
	Overloading a = new Overloading();
	a.test1("jeyarahav");
	a.test2(23, 'A');
	a.test3(321654l, .032f, true);
	
}
}
