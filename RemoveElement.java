public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

/*
return number of elements after we iterate through nums
if we spot value, ignore it
else, we will swap nums[k] with nums[i]
increment k
*/
