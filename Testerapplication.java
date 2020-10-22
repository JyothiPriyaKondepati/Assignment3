
public class Testerapplication {

	public static void main(String[] args) {
		Salariedemployeee se = new Salariedemployeee(60000);
		System.out.println(se);
		Hourlyemployee h = new Hourlyemployee(6500, 600);
		System.out.println(h);
		Comissionemployee c = new Comissionemployee(20000, 606);
		System.out.println(c);
	}
}