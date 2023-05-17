package PracticeProject3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {
	public static List<Integer> findLongestIncreasingSubsequence(int[] numbers) {
		int n = numbers.length;
		int[] lengths = new int[n];
		Arrays.fill(lengths, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (numbers[i] > numbers[j] && lengths[i] < lengths[j] + 1) {
					lengths[i] = lengths[j] + 1;
				}
			}
		}

		int maxLengthIndex = 0;
		for (int i = 1; i < n; i++) {
			if (lengths[i] > lengths[maxLengthIndex]) {
				maxLengthIndex = i;
			}
		}

		List<Integer> lis = new ArrayList<>();
		int maxLength = lengths[maxLengthIndex];
		lis.add(numbers[maxLengthIndex]);

		for (int i = maxLengthIndex - 1; i >= 0; i--) {
			if (numbers[i] < numbers[maxLengthIndex] && lengths[i] == maxLength - 1) {
				lis.add(numbers[i]);
				maxLength--;
				maxLengthIndex = i;
			}
		}

		return reverseList(lis);
	}

	private static List<Integer> reverseList(List<Integer> list) {
		List<Integer> reversed = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reversed.add(list.get(i));
		}
		return reversed;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		List<Integer> lis = findLongestIncreasingSubsequence(numbers);
		System.out.println("Longest Increasing Subsequence: " + lis);
	}
}
