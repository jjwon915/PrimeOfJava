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
		
		System.out.println("상품 1 번호 : " + VO1.vaNo);
		System.out.println("상품 1 이름 : " + VO1.vaName);
		System.out.println("상품 1 가격 : " + VO1.vaPrice);
		System.out.println("상품 1 수량 : " + VO1.vaQuantity);
		System.out.println("---------------------------");
		System.out.println("상품 2 번호 : " + VO2.vaNo);
		System.out.println("상품 2 이름 : " + VO2.vaName);
		System.out.println("상품 2 가격 : " + VO2.vaPrice);
		System.out.println("상품 2 수량 : " + VO2.vaQuantity);
				
 	}

}
