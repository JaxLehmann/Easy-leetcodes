from typing import List
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        num_count = {}

        for num in nums:
            num_count[num] = num_count.get(num, 0) + 1

        for count in num_count.values():
            if count > 1:
                return True
        return False
sol = Solution()
print(sol.containsDuplicate([1, 2, 3, 1]))
print(sol.containsDuplicate([1, 2, 3, 4]))
print(sol.containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]))


## Create an empty dictionary
## Loop through each number (num) in the array (nums)
## Add each value in the list to default Value 0, Increment by 1 for each observation
## Loop through the Hashmap values
## If the value is greater than 1, return True (meaning we've seen a duplicate)
## Return false (if there are no duplicates found)