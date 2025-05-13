import java.util.HashMap;
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        for (int numbers : count.keySet()) {
            if (count.get(numbers) == 1) {
                return numbers;
            }
        } return -1;
    }
    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();
        int[] test1 = {2, 2, 1};
        System.out.println("Single Number (Test 1): " + sol.singleNumber(test1));
        int[] test2 = {4, 1, 2, 1, 2};
        System.out.println("Single Number (Test 2): " + sol.singleNumber(test2));
        int[] test3 = {1};
        System.out.println("Single Number (Test 3): " + sol.singleNumber(test3));
    }
}

/* Array nums, every element appears twice EXCEPT for once. Find that single one and RETURN IT
Can create a hashmap to store the count
Iterate through the hashmap and find the key with a value of 1
Return that number */