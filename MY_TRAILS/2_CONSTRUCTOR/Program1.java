// CALL ONE CONSTRUCTOR FROM ANOTHER CONSTRUCTOR
// this(parameter) must be first instruction in a constructor
// We can use only one this() in a constructor

class Solution{
	Solution(){
		this(10);
		System.out.println("In Default Constructor");
//		this(10);
	}
	Solution(int x){
		System.out.println("In Parameterized Constructor");
	}
	public static void main(String[]args){
		Solution s = new Solution();
	}
}
