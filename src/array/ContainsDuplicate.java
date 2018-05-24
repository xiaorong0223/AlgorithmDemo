package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 
 * 如果任何值在数组中出现至少两次，函数应该返回 true。如果每个元素都不相同，则返回 false。
 * 
 * @author RunyuanLiang
 *
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		System.out.println(containsDuplicate.containsDuplicate1(new int[] { 1, 2, 3, 4 }));
	}

	public boolean containsDuplicate1(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

	public boolean containsDuplicate2(int[] nums) {

		if (nums == null || nums.length == 0)
			return false;
		Set set = new HashSet<>();
		for (int a : nums) {
			if (!set.add(a))
				return true;
		}
		return false;
	}

}
