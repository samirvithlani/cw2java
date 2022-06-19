package oops.abstractoin;

interface Brand{
	
	public void name();
}
interface Gadget{
	
	//by default all methods are public abstract..
	//instance varible... by default public final static
	int x=150;
	void screen() ;
	public abstract void button();	
	
}

class Mobile implements Gadget,Brand{

	@Override
	public void screen() {
		//x = 150;
		// TODO Auto-generated method stub
		System.out.println(x);
		
	}

	@Override
	public void button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class Eletronic {
	
	public static void main(String[] args) {
		
		
		Gadget g = new Mobile();
		g.screen();
	}

}
