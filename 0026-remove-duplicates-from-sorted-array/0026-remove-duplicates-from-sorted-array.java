class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        int i = 0; // Pointer for placing unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // Found a new unique element
                i++; // Move pointer i to the next position
                nums[i] = nums[j]; // Place the unique element at position i
            }
        }
        return i + 1; // The count of unique elements is i + 1
    }
}