package primary;
/**
 *
 * @author jjwon
 * @date : 2021.06.28
 * Ŭ���� �ּ� : ����� ������ �� �ִ�.
 *
 */
public class Remark {

	public static void main(String[] args) {

		methodOne();
		methodTwo();

	}
	
	public static void methodOne() {
		System.out.println("�޼ҵ� 1");
		int one = 10;
		int two = 20;
		int three = 5;
		three = one + two;
		System.out.println(three);
	}
	
	public static void methodTwo() {
		System.out.println("�޼ҵ� 2");
		int one = 10;
		int two = 20;
		int three = 5;
		//three = one + two;
		System.out.println(three);
	}

}
