package casting;

class Par{
	
}
public class CastingDemo1 extends Par {

	public static void main(String[] args) {

		int a = 100;
		// String str = (String)a;
		
		CastingDemo1 c= new CastingDemo1();
		//Par p = c;
		CastingDemo1 c1 = (CastingDemo1)new Object();
		CastingDemo1 c2 = (CastingDemo1)new Par();
	}
}
