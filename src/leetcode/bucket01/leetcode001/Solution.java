package leetcode.bucket01.leetcode001;

public class Solution {
  public int numWaterBottles(int numBottles, int numExchange) {
    int drunkBottles = 0;
    int drinkableBottles = numBottles;
    int emptyBottles = 0;

    while (drinkableBottles > 0) {
      drunkBottles += drinkableBottles;

      emptyBottles += drinkableBottles;
      drinkableBottles = 0;

      drinkableBottles = (int) (emptyBottles + drinkableBottles) / numExchange;
      emptyBottles = emptyBottles - (drinkableBottles * numExchange);
    }

    return drunkBottles;
  }
}
