package primary;

public class Calc {

	public static void main(String[] args) {
		
		// shift ������
		int first = 10;
		int second = 2;
		first = second >> 2;
		System.out.println(first);
		
		second = 2;
		first = second << 2;
		System.out.println(first);
		
		second = 2;
		first = second << 1;
		System.out.println(first);

	}

}
