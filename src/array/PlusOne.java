package array;

public class PlusOne {

	public static void main(String[] args) {

		PlusOne plusOne = new PlusOne();
		int[] digits = { 9, 9, 9 };
		int[] res = plusOne.plusOne(digits);
		for (int i : res) {
			System.out.print(i);
		}
	}

	public int[] plusOne(int[] digits) {

		if (digits == null || digits.length == 0) {
			return digits;
		}
		//carry 表示进位
		int carry = 1;
		int length = digits.length;
		int temp = 0;
		for (int i = length - 1; i >= 0; i--) {
			temp = digits[i] + carry;
			digits[i] = temp % 10;
			carry = temp / 10;
		}
		if (carry == 0) {
			return digits;
		} else {
			int[] res = new int[length + 1];
			res[0] = 1;
			for (int i = 0; i < length; i++) {
				res[i + 1] = digits[i];
			}
			return res;
		}
	}
}
