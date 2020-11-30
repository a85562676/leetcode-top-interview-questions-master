package Top150;

public class Problem_0340_LongestSubstringWithAtMostKDistinctCharacters {

	public static int lengthOfLongestSubstringKDistinct(String s, int k) {
		if (s == null || s.length() == 0 || k < 1) {
			return 0;
		}
		char[] str = s.toCharArray();
		int N = str.length;
		int[] count = new int[256];
		int dist = 0;
		int R = 0;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			while (R < N && (dist < k || (dist == k && count[str[R]] > 0))) {
				dist += count[str[R]] == 0 ? 1 : 0;
				count[str[R++]]++;
			}
			// R 来到违规的第一个位置
			ans = Math.max(ans, R - i);
			dist -= count[str[i]] == 1 ? 1 : 0;
			count[str[i]]--;
		}
		return ans;
	}

}
