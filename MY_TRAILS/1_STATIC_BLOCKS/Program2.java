class Solution{
	static{
		System.out.println("In Static Block");
	}

	Solution(){
		System.out.println("In Constructor");
	}

	public static void main(String[]args){
		Solution s = new Solution();
	}
}
