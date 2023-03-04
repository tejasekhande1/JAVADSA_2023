// METHOD OVERRIDING

class Parent{
	void property(){
		System.out.println("Banglo");
	}	
}

class Child extends Parent{
	void property(){
		System.out.println("Banglo + Company + Car");
	}
}

class Solution{
	public static void main(String[]args){
		Parent p = new Parent();
		p.property();	
	
		Parent p1 = new Child();
		p1.property();	
	}
}
