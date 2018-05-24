package array;

import java.util.HashMap;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j
 * 的差的绝对值最大为 k。
 * 
 * @author RunyuanLiang
 *
 */
public class ContainsNearbyDuplicate {

	public static void main(String[] args) {
		ContainsNearbyDuplicate containsNearbyDuplicate = new ContainsNearbyDuplicate();
		System.out.println(containsNearbyDuplicate.containsNearbyDuplicate(new int [] {1,2,3,1},3));

	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums == null || nums.length == 0) {
			return false;
		}
		HashMap< Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(nums[i])) {
				int sub = i-hm.get(nums[i]);
				if (sub<=k) {
					return true;
				}else {
					hm.put(nums[i], i);
				}
			}else {
				hm.put(nums[i], i);
			}
		}

	return false;
}

}
