package com.basic.reusingClasses;

public class PrimitiveDefaultValueTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultValue dv = new DefaultValue();
		System.out.println(dv.toString());
		
	}

}

class DefaultValue{
	int i;
	float f;
	long l;
	double d;
	char c;
	boolean b;
	String str;
	
	@Override
	public String toString() {
		return "Default Values for primitive:-"
				+ "\nint:"+i 
				+ "\nfloat:"+f 
				+ "\nlong:"+l 
				+"\ndouble:"+d 
				+ "\nchar:"+c 
				+ "\nboolean:"+b 
				+ "\nString:"+str;
	}
}
