package interface02;

public class MyInterImp1 implements MyInter{

	@Override
	public int sum(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length ; i= i + 1) {
		result += nums[i];
	}
		return result;
	}

}
