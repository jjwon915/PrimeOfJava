package primary;

public class VariablesUse {

	public static void main(String[] args) {
		
		VariableVO VO1 = new VariableVO();
		VariableVO VO2 = new VariableVO();
		
		VO1.vaNo = "V001";
		VO1.vaName = "water";
		VO1.vaPrice = 800;
		VO1.vaQuantity = 100;
		
		VO2.vaNo = "V002";
		VO2.vaName = "apple";
		VO2.vaPrice = 1000;
		VO2.vaQuantity = 20;
		
		System.out.println("��ǰ 1 ��ȣ : " + VO1.vaNo);
		System.out.println("��ǰ 1 �̸� : " + VO1.vaName);
		System.out.println("��ǰ 1 ���� : " + VO1.vaPrice);
		System.out.println("��ǰ 1 ���� : " + VO1.vaQuantity);
		System.out.println("---------------------------");
		System.out.println("��ǰ 2 ��ȣ : " + VO2.vaNo);
		System.out.println("��ǰ 2 �̸� : " + VO2.vaName);
		System.out.println("��ǰ 2 ���� : " + VO2.vaPrice);
		System.out.println("��ǰ 2 ���� : " + VO2.vaQuantity);
				
 	}

}
