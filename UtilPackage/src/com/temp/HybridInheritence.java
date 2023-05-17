package com.temp;

//performing Hierarchical Inheritance 3-20
class X{
	public void meth1() {
		System.out.println("\nmeth 1 class X");
	}
}

class Y extends X{
	public void meth2() {
		System.out.println("meth 2 class Y");
		}
}

class Z extends X{
	public void meth3() {
		System.out.println("meth 3 class Z");
	}
}

// performing multilevel
public class HybridInheritence extends Z {
	
	public void meth4() {
		System.out.println("meth 4 class HybridInheritence");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hierarchical inheritance 33-40
		//creating object of class B
				Y y=new Y();
				y.meth1();
				y.meth2();
				
				//creating object of class C
				Z z=new Z();
				z.meth1();
				z.meth3();
				
		// multilevel inheritance 
			
				HybridInheritence h=new HybridInheritence();
				h.meth1();
				h.meth3();
				h.meth4();
				
		

	}

}
