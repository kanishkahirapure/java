public class RotatedBinarySearch {
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Target mil gaya
            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[start] <= nums[mid]) {
                // Target left me hai?
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                // Target right me hai?
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(nums, target);
        System.out.println("Index of target is: " + result);
    }
}



// Best Time to Buy and Sell Stock


// public class MaxProfit {
//     public static int maxProfit(int[] prices) {
//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             if (prices[i] < minPrice) {
//                 minPrice = prices[i]; // update min
//             } else if (prices[i] - minPrice > maxProfit) {
//                 maxProfit = prices[i] - minPrice; // update profit
//             }
//         }

//         return maxProfit;
//     }

//     public static void main(String[] args) {
//         int[] prices1 = {7, 1, 5, 3, 6, 4};
//         int[] prices2 = {7, 6, 4, 3, 1};

//         System.out.println("Max Profit (Example 1): " + maxProfit(prices1)); // Output: 5
//         System.out.println("Max Profit (Example 2): " + maxProfit(prices2)); // Output: 0
//     }
// }

