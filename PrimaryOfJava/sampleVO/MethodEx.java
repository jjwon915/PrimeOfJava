package sampleVO;

import java.util.Date;

public class MethodEx {

	public static void main(String[] args) {
		
		SampleVO sample1 = new SampleVO();
		sample1.sampleBoolean = true;
		sample1.sampleChar = 'a';
		sample1.sampleString = "english";
		sample1.sampleByte = 1;
		sample1.sampleShort = 10;
		sample1.sampleInt = 100;
		sample1.sampleLong = 1000;
		sample1.sampleFloat = 1.1f;
		sample1.sampleDouble = 1.2345;
		
		System.out.println("boolean : " + sample1.sampleBoolean);
		System.out.println("char : " + sample1.sampleChar);
		System.out.println("String : " + sample1.sampleString);
		System.out.println("Byte : " + sample1.sampleByte);
		System.out.println("Short : " + sample1.sampleShort);
		System.out.println("Int : " + sample1.sampleInt);
		System.out.println("Long : " + sample1.sampleLong);
		System.out.println("Float : " + sample1.sampleFloat);
		System.out.println("Double : " + sample1.sampleDouble);
		
		Date date = new Date();
		System.out.println(date);

	}

}
