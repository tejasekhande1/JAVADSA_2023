// USE OF SUPER WITH METHOD

class Vehicle{
	void message(){
		System.out.println("In Parent Message");
	}
}

class Car extends Vehicle{
	
	void message(){
		System.out.println("In Child Message");
	}
	
	void show()
	{
		message();
		super.message();
	}
}

class Solution{
	public static void main(String[]args){
		Car small = new Car();
		small.show();
	}
}
