package java8.feature.interface_changes;

public class java8DefaultStaticChild implements java8DefaultStaticMethod,java8DefaultStaticMethod1 {

	
	public static void main(String[] args) {
		java8DefaultStaticChild java8= new java8DefaultStaticChild();
		System.out.println(java8Interface.producer());
		System.out.println(java8.print());
		System.out.println(); 
		System.out.println(java8.print());
	}

	

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return java8DefaultStaticMethod.super.print()+java8DefaultStaticMethod1.super.print();
	}
	
}
