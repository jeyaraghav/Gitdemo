package AccDiffPackage;
// diiferent package --- import packagename.classname;
import AccSamePackage.Acc1;
import AccSamePackage.Acc2;
public class Acc3 {
	
	private void test5() {
System.out.println("test5");
	}
public static void main(String[] args) {
	Acc3 c = new Acc3();
	c.test5();
	Acc1 d = new Acc1();
	
	d.Test3();
	
	Acc2 e = new Acc2();
	e.test4();
	
	
}
}
