# Solution

< UP TO POST >

# Enhanced Solution

The enhanced solution that i could find was to use a hashmap to store the index of the element in the array. This way we can get the index of the element in O(1) (instead of O(n) on the brute force solution).

```java
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int index = 0; index < nums.length; index++) {
      int complementary = target - nums[index];

      if (numToIndex.containsKey(complementary)) {
        return new int[] { numToIndex.get(complementary), index };
      }

      numToIndex.put(nums[index], index);
    }

    return null;
```
