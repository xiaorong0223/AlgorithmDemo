package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * @author RunyuanLiang 输入: 5 输出: [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]
 *         ]
 *
 */
public class ArrayGenerate {

	public static void main(String[] args) {

		ArrayGenerate arrayGenerate = new ArrayGenerate();
		List<List<Integer>> result = arrayGenerate.generate(5);
		for (int i = 0; i < result.size(); i++) {
			System.out.println((result.get(i)));
		}

	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			return result;
		}
		List<Integer> temp1 = new ArrayList<Integer>();
		temp1.add(1);
		result.add(temp1);
		for (int i = 1; i < numRows; i++) {
			List<Integer> last = result.get(i - 1);
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(1);
			for (int j = 1; j < i; j++) {
				temp.add(last.get(j - 1) + last.get(j));
			}
			temp.add(1);
			result.add(temp);
		}
		return result;

	}

}
