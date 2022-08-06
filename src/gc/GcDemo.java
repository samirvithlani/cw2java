package gc;

public class GcDemo {
	static GcDemo gc;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finlalize");
		gc = null;
		super.finalize();
	}

	public static void main(String[] args) {
		gc = new GcDemo();
		try {
			// gc.finalize();
			gc.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
