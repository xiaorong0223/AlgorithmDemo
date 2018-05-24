package array;

import javax.naming.InitialContext;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中 返回它将会被按顺序插入的位置。你可以假设数组中无重复元素。
 * 
 * @author RunyuanLiang
 *
 */
public class SearchIndex {

	public static void main(String[] args) {

	}

	public int searchInsert(int[] nums, int target) {
		int index = 0;
		for (index = 0; index < nums.length; index++) {
			if (target <= nums[index]) {
				break;
			}
		}
		return index;

	}
}
