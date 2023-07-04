import task2.ListNode;
import task3.Solution;

// the class to check results
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring(" "));
        System.out.println(solution.lengthOfLongestSubstring("abc"));

    }
}
