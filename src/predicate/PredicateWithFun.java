package predicate;

import java.util.function.Predicate;

import javax.swing.text.StyledEditorKit.BoldAction;

public class PredicateWithFun {

	public boolean check(Predicate<String> p,String name) {
		
		return p.test(name);
	}
	
	public static void checkPredicate() {
		
		Predicate<String>  containing = p->p.contains("A");
		Predicate<String> hasLen = p->p.length()>4;
		boolean res = hasLen.and(containing).test("SAmmm");
		System.out.println(res);
 	}
	
	public static void main(String[] args) {
		
		
		checkPredicate();
		
		PredicateWithFun p = new PredicateWithFun();
		System.out.println(p.check(i->i.equals("raj"), "ram"));
		
		
		
	}
}
