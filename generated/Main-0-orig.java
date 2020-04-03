public class Main {
	public static void main(String[] args) {
		Object o = null;
		System.out.println(o);

		o = new Object();
		System.out.println(o); System.out.println(o);
		
		//comment
		
		for (int i = 0; i < 10; i++) {
			continue;
		}

		while(args.length > 1) {
			System.out.println(o);
		}

		int n = args.length > 0 ? 99 : 999;

		System.out.println("");
	}

}
