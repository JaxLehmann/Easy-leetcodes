import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> largeNum = new HashMap<>();
        int result = 0;
        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            largeNum.put(nums[i], largeNum.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : largeNum.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        result = maxKey;
        return result;

    }
    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();

        int[] test1 = {3, 2, 3};
        System.out.println("Test 1: " + sol.majorityElement(test1)); // Output: 3

        int[] test2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Test 2: " + sol.majorityElement(test2)); // Output: 2

        int[] test3 = {1};
        System.out.println("Test 3: " + sol.majorityElement(test3)); // Output: 1

        int[] test4 = {1, 1, 1, 2, 2};
        System.out.println("Test 4: " + sol.majorityElement(test4)); // Output: 1
    }
}
/*
Given an array
Return the element that appears the most
I think we can create a Hashmap
Map to the values
Whichever key has the highest value, return that result
Tricky part is trying to find the greatest value in the hashmap
*/
