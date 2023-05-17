package com.temp;
//creating parent class
class Parent{
	int x=10;
	public void meth1() {
		System.out.println("meth1(parent class) executed");
	}
	
	public void meth2() {
		System.out.println("meth2(parent class ) executed");
	}
}

//creating child class
public class SingleInheritence extends Parent {
	
	public void meth3() {
		System.out.println("meth3(child class) executed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInheritence s= new SingleInheritence();
		s.meth1();
		s.meth2();
		s.meth3();
		System.out.println("value of x which is denfined in class parent is: "+s.x);

	}

}
