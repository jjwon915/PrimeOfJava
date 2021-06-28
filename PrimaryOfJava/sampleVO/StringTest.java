package sampleVO;

public class StringTest {

	public static void main(String[] args) {
		
		String companyName = "samsung";
		System.out.println(companyName);
		
		String biocompanyName = companyName + " bioLogics";
		System.out.println(biocompanyName);
		
		String country1 = "한국";
		String country2 = "한국";
		boolean bool = country1 == country2;
		System.out.println(bool);
		
		String strcountry1 = new String("한국");
		String strcountry2 = new String("한국");
		boolean bool2 = strcountry1 == strcountry2;
		// false가 출력된다.(주소값이 다르니까.)
		System.out.println("bool2 : " + bool2);
		
		boolean bool3 = strcountry1.equals(strcountry2);
		// true가 출력된다.
		System.out.println("bool3 : " + bool3);
		
		StringBuilder sb = new StringBuilder("한국");
		sb.append("대사관");
		System.out.println(sb.toString());
		
		StringBuffer sbf = new StringBuffer("Europe");
		sbf.append("Travel");
		System.out.println(sbf.toString());

	}

}
