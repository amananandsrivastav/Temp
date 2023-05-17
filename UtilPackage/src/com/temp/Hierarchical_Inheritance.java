package com.temp;


class A{
	public void meth1() {
		System.out.println("\nmeth 1 class A");
	}
}

class B extends A{
	public void meth2() {
		System.out.println("meth 2 class B");
		}
}

class C extends A{
	public void meth3() {
		System.out.println("meth 3 class C");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of class B
		B b=new B();
		b.meth1();
		b.meth2();
		
		//creating object of class C
		C c=new C();
		c.meth1();
		c.meth3();
	}

}
