package sampleVO;

public class StringTest {

	public static void main(String[] args) {
		
		String companyName = "samsung";
		System.out.println(companyName);
		
		String biocompanyName = companyName + " bioLogics";
		System.out.println(biocompanyName);
		
		String country1 = "�ѱ�";
		String country2 = "�ѱ�";
		boolean bool = country1 == country2;
		System.out.println(bool);
		
		String strcountry1 = new String("�ѱ�");
		String strcountry2 = new String("�ѱ�");
		boolean bool2 = strcountry1 == strcountry2;
		// false�� ��µȴ�.(�ּҰ��� �ٸ��ϱ�.)
		System.out.println("bool2 : " + bool2);
		
		boolean bool3 = strcountry1.equals(strcountry2);
		// true�� ��µȴ�.
		System.out.println("bool3 : " + bool3);
		
		StringBuilder sb = new StringBuilder("�ѱ�");
		sb.append("����");
		System.out.println(sb.toString());
		
		StringBuffer sbf = new StringBuffer("Europe");
		sbf.append("Travel");
		System.out.println(sbf.toString());

	}

}
