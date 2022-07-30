package exception;

public class Check {

	public void validate(String name) throws ValidException {

		if (name.length() < 5) {

			//throw new ValidException("please check length of string !!");
			//throw new ValidException();
			//System.out.println("check lenght");
		}

	}

	public static void main(String[] args) {

		Check c = new Check();
		try {
			c.validate("");
		} catch (ValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("check length..");
		}
	}
}
