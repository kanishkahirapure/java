// public class RemoveDuplicates {
//     public static int removeDuplicates(int[] nums){
//         int k = 0; // Unique elements ka count
//         for(int i = 0; i < nums.length; i++) {
//             // Agar current element pehle se unique hai
//             if(i == 0 || nums[i] != nums[i - 1]) {
//                 nums[k] = nums[i]; // Unique element ko store karo
//                 k++; // Unique count badhao
//             }
//         }
//         return k; // Unique elements ka count return karo

//     }
//     // Main method to test the removeDuplicates function
//         public static void main(String[] args) {
//             int[] nums = {1, 1, 2, 2, 6, 4, 4};
//             int k = removeDuplicates(nums);// Call the function to remove duplicates
//             // Print the result

//             System.out.println("Unique elements count: " + k);
//             System.out.print("Unique elements: ");
//             for(int i = 0; i < k; i++) {
//                 System.out.print(nums[i] + " ");
//             }
//         }
    
// }


// 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

public class RemoveDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        System.out.println(result); // Output: true
    }
}

