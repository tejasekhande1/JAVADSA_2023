class Solution{
	Solution(){
		System.out.println("In Constructor");
	}

	static{
		System.out.println("In Static Block");
	}

	public static void main(String[]args){
		Solution s = new Solution();
	}
}

// STATIC BLOCKS EXCEUTE EVEN BEFORE THE CONSTRUCTOR
