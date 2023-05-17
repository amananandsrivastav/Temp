package com.temp;

//creating parent class
class Class1{
	public void meth1() {
		System.out.println("meth1(parent class) executed");
	}
}

//creating child class
class Class2 extends Class1{
	public void meth2() {
		System.out.println("meth2(child class) executed");
	}
	
}

//creating sub child class
public class MultiLevelInhertence extends Class2 {
	
	public void meth3() {
		System.out.println("meth3(sub child class) executed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInhertence m=new MultiLevelInhertence();
		m.meth1();
		m.meth2();
		m.meth3();
		System.out.println();
		Class2 c2=new Class2();
		c2.meth1();
		c2.meth2();
		//c2.meth3();	//not accessible in class2
		
		System.out.println();
		
		Class1 c1=new Class1();
		c1.meth1();
		//c1.meth2();	//not accessible in class1
		//c1.meth3();	//not accessible in class1
		

	}

}
