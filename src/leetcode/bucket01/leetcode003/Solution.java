package leetcode.bucket01.leetcode003;

class Solution {
  public boolean isPalindrome(int x) {
    String splittedNumber = Integer.toString(x);
    String reversedNumber = "";

    for (int index = splittedNumber.length() - 1; index >= 0; index--) {
      reversedNumber += splittedNumber.charAt(index);
    }

    return reversedNumber.equals(splittedNumber);
  }
}