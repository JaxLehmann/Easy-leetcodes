import java.util.*;
class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> counter1 = new HashMap<>();
        HashMap<Integer, Integer> counter2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            counter1.put(nums1[i], counter1.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            counter2.put(nums2[i], counter2.getOrDefault(nums2[i], 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int key : counter1.keySet()) {
            if (counter2.containsKey(key)) {
                result.add(key);
            }
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}

/* Given two integer arrays
Nums 1 and Nums 2
Return an array of their intersection. Elements in the result must be UNIQUE
Ex: nums 1 = 1 2 2 1, nums 2 - 2 2. Output is an array of 2
n1 = 4 9 5, n2 = 9 4 9 8 4. Output is an array of 9, 4
Can go through all values and store in 2 hashmaps
Next, store all the keys via loops and adadd them to an array
loop through the result array, getting all indexes and add to the final result array

Must be an easier way to do it but I cannot think of one*/
