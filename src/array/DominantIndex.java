package array;

/**
 * 
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 * 
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * 
 * 如果是，则返回最大元素的索引，否则返回-1。
 * 
 * @author RunyuanLiang
 *
 */
public class DominantIndex {

	public static void main(String[] args) {
		DominantIndex dominantIndex = new DominantIndex();
		System.out.println(dominantIndex.dominantIndex(new int[] { 1, 2, 3, 4 }));

	}

	public int dominantIndex(int[] nums) {
		if (nums == null && nums.length == 0) {
			return -1;
		} else {

			int max1 = 0;
			int max2 = 0;
			int maxIndex = 0;
			for (int i = 0; i < nums.length; i++) {
				// 求最大值
				if (nums[i] > max1) {
					max2 = max1;
					max1 = nums[i];
					maxIndex = i;
				} else if (nums[i] > max2) {
					max2 = nums[i];
				}
			}
			return max1 >= 2 * max2 ? maxIndex : -1;

		}
	}
}
