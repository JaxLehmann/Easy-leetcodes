public class TypeOfTriangle {
    public String triangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[0] == nums[2]) {
            return "equilateral";
        } else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]) {
            return "scalene";
        } else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
            return "isosceles";
        } else {
            return "none";
        }
    }

    /*
    Series of if statements
    3 sides equal for equilateral
    all sides different for scalene
    isosceles 2 sides equal
    base case for valid triangle
     */

    public static void main(String[] args) {
        TypeOfTriangle triangleChecker = new TypeOfTriangle();

        // Test Cases
        System.out.println("Test 1: " + triangleChecker.triangleType(new int[]{3, 3, 3})); // equilateral
        System.out.println("Test 2: " + triangleChecker.triangleType(new int[]{3, 4, 5})); // scalene
        System.out.println("Test 3: " + triangleChecker.triangleType(new int[]{3, 3, 5})); // isosceles
        System.out.println("Test 4: " + triangleChecker.triangleType(new int[]{5, 3, 3})); // isosceles
        System.out.println("Test 5: " + triangleChecker.triangleType(new int[]{5, 5, 3})); // isosceles
    }
}

