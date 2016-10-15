package com.onmobile.pack1;

public class Main {

	public static void main(String[] args) {
		
		//Wrapper Class
		int num1 = Integer.parseInt(args[0]);
		float num2 = Float.parseFloat(args[1]);
		double num3 = Double.parseDouble(args[2]);
		String str = args[3];
		char ch = args[4].charAt(0);
//		byte b = Byte.parseByte(args[5]);
		double res = num1 + num2 + num3;
		
		System.out.println("Total = "+res);
		System.out.println("Str = "+ str);
		System.out.println("Character value: "+ch);
		
		//AutoBoxing
		int i = 420;
		Integer wInt = new Integer(i);//this is called boxing
		int i1 = wInt.intValue();//this is called unboxing
		
		System.out.println("wInt = "+wInt+ " int unboxed "+i1);
		
		
		String str1 = "123";
		int x = Integer.valueOf(str1).intValue();
		System.out.println("int value " + x);
		
		//AutoBoxing
		int pInt1 = 120;
		Integer wInt1 = pInt1;
		int p1 =wInt1;
		
		System.out.println("wInt = "+wInt1+ " int unboxed "+p1);
	}

}
