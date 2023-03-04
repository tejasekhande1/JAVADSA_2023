class Parent{
	Parent(){
		System.out.println("In Parents Constructor");
	}
}

class Child extends Parent{
	Child(){
		super();            // by default hidden
		System.out.println("In Child Constructor");
	}
}

class Solution{
	public static void main(String[]args){
		Child c = new Child();
	}
}
