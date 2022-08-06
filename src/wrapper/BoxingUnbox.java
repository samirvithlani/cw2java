package wrapper;

public class BoxingUnbox {

	public static void main(String[] args) {

		String age = "15";
		System.out.println(age);
		String flag ="true";
		boolean b = Boolean.parseBoolean(flag);
		System.out.println(b);

		try {
			if (!age.equals(null) && !age.equals("")) {
				int iage = Integer.parseInt(age);
				System.out.println(iage * 2);
			}
			else {
				System.out.println("empty");
			}
		} catch (NumberFormatException e) {
			System.out.println("please check data...");
		}

	}

}
