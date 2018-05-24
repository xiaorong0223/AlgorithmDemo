package array;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 * 
 * @author RunyuanLiang
 *
 */
public class MaxSubArray {

	public static void main(String[] args) {
		MaxSubArray maxSubArray = new MaxSubArray();
		int[] nums = new int[] { 6, -3, -2, 7, -15, 1, 2, 2 };

		// int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray.maxSubArray(nums));
	}

	public int maxSubArray(int[] nums) {

		if (nums == null || nums.length == 0)
			return 0;
		int currentSum = 0; // 存储当前连续n项的和
		int max = nums[0]; // 存储连续子元素的最大值
		for (int i = 0; i < nums.length; i++) {
			if (currentSum <= 0) {
				currentSum = nums[i];
			} else {
				currentSum += nums[i];
			}
			if (currentSum > max) {
				max = currentSum;
			}
		}
		return max;
	}
}
