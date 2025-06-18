public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int k = 0; // Count of elements not equal to val
        for(int i = 0; i < nums.length; i++) {
            // If current element is not equal to val
            if(nums[i] != val) {
                nums[k] = nums[i]; // Store the element at index k
                k++; // Increment the count
            }
        }
        return k; // Return the count of elements not equal to val
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int val = 3; // Element to be removed
        int k = removeElement(nums, val); // Call the function to remove elements equal to val

        // Print the result
        System.out.println("Count of elements not equal to " + val + ": " + k);
        System.out.print("Elements not equal to " + val + ": ");
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


