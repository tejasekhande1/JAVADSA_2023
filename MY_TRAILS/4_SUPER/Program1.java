// USE OF SUPER WITH VARIABLES

class Vehicle{
	int maxSpeed = 120;
}

class Car extends Vehicle{
	int maxSpeed = 180;
	void show()
	{
		System.out.println(super.maxSpeed);
		System.out.println(maxSpeed);
	}
}

class Solution{
	public static void main(String[]args){
		Car small = new Car();
		small.show();
	}
}
