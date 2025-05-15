import java.io.*;
import java.util.*;
public class ArrayIntersectionII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            count.put(nums1[i], count.getOrDefault(nums1[i], 0) + 1);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (count.containsKey(nums2[j]) && count.get(nums2[j]) > 0) {
                result.add(nums2[j]);
                count.put(nums2[j], count.get(nums2[j]) - 1);
            }
        }
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    public static void main (String[] args) {
        ArrayIntersectionII sol = new ArrayIntersectionII();

        int[] test1 = sol.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        System.out.println("Test 1: " + Arrays.toString(test1)); // Expected: [2, 2]

        int[] test2 = sol.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println("Test 2: " + Arrays.toString(test2)); // Expected: [4, 9] or [9, 4]

        int[] test3 = sol.intersect(new int[]{1, 2, 2, 3}, new int[]{2, 2, 3, 4});
        System.out.println("Test 3: " + Arrays.toString(test3)); // Expected: [2, 2, 3]

        int[] test4 = sol.intersect(new int[]{1}, new int[]{1, 1});
        System.out.println("Test 4: " + Arrays.toString(test4)); // Expected: [1]

        int[] test5 = sol.intersect(new int[]{}, new int[]{1, 2});
        System.out.println("Test 5: " + Arrays.toString(test5)); // Expected: []
    }
}

/*
Two arrays are given nums1 nums2
Return an array of the common elements in them, as many times as they are shown
Create a hashmap for nums1
If the elements of nums2 are in that Hashmap already, add to result
Decrement count in hashmap
Transfer result from arraylist to array using stream import
Return result */
