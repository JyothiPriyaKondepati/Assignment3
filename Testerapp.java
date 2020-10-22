
public class Testerapp {

	public static void main(String[] args) {
		InVoice invoice = new InVoice("1", "Watch", 4, 1000.0);
		String k = invoice.toString();
		System.out.println(k);
	}
}