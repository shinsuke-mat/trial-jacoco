import java.util.ArrayList;

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

		int x = args.length > 0 ? 99 : 999;
		System.out.println("");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach(n -> System.out.println(n));
        numbers.stream()
            .filter(n -> n > 3)
            .forEach(n -> System.out.println(n));
	}

}
