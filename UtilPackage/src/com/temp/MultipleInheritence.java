package com.temp;

class Demo1{
	public void meth1() {
		System.out.println("meth1(parent class) executed");
	}
}
interface Demo2{
	public void meth2(); 
}

/*
public class MultipleInheritence extends Demo1,Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
public class MultipleInheritence extends Demo1 implements Demo2 {
	
	@Override
	public void meth2() {
		System.out.println("meth2(parent interface) executed");
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInheritence m=new MultipleInheritence();
		m.meth1();
		m.meth2();
		

	}

}
