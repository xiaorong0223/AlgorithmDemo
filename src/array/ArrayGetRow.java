package array;

import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。 
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * @author RunyuanLiang
 *
 */
public class ArrayGetRow {

	public static void main(String[] args) {

		ArrayGetRow arrayGetRow = new ArrayGetRow();
		System.out.println(arrayGetRow.getRow(3));

	}

	public List<Integer> getRow(int rowIndex) {

		Integer[] result = new Integer[rowIndex + 1];
		Arrays.fill(result, 0);
		result[0] = 1;
		for (int i = 1; i < result.length; i++) {
			for (int j = i; j > 0; j--) {
				result[j] = result[j] + result[j - 1];
			}
		}
		return Arrays.asList(result);
	}

}
