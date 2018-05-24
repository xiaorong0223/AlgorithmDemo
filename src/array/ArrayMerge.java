package array;

import java.util.Arrays;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 
 * 说明:
 * 
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存
 * nums2 中的元素。 示例:
 * 
 * 输入: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6], n = 3
 * 
 * 输出: [1,2,2,3,5,6]
 * 
 * @author RunyuanLiang
 *
 */
public class ArrayMerge {

	public static void main(String[] args) {
		ArrayMerge arrayMerge = new ArrayMerge();
		int[] nums1 = { 2, 0 };
		int m = 1;
		int[] nums2 = { 1 };
		int n = 1;
		arrayMerge.merge2(nums1, m, nums2, n);
	}

	public void merge1(int[] nums1, int m, int[] nums2, int n) {

		if (nums1 == null || nums2 == null || nums2.length == 0) {
			return;
		}
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j])
				nums1[k--] = nums1[i--];
			else
				nums1[k--] = nums2[j--];
		}
		if (i > 0) {
			while (i >= 0) {
				nums1[k--] = nums1[i--];
			}
		} else {
			while (j >= 0) {
				nums1[k--] = nums2[j--];

			}
		}

		System.out.println(Arrays.toString(nums1));

	}

	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		int[] tempArray = new int[m];
		System.arraycopy(nums1, 0, tempArray, 0, m);
		int i = 0;
		int j = 0;
		int k = 0;
		for (; k < m + n && i < m && j < n; k++) {
			int temp1 = tempArray[i];
			int temp2 = nums2[j];
			if (temp1 > temp2) {
				nums1[k] = temp2;
				j++;
			} else {
				nums1[k] = temp1;
				i++;
			}
		}
		if (i < m) {
			for (; k < m + n; k++) {
				nums1[k] = tempArray[i];
				i++;
			}
		} else if (j < n) {
			for (; k < m + n; k++) {
				nums1[k] = nums2[j];
				j++;
			}
		}

		System.out.println(Arrays.toString(nums1));

	}
}
