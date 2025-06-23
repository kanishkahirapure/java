public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }else if (target < nums[mid]){
                high = mid - 1; // move left
            }else{
                low = mid + 1; // move right
            }
        }
        return low; // If target is not found, low will be the insertion point
    }

    public static void  main(String[] args){
        int [] nums = {1, 2, 3,4, 5, 6};
        int target = 8;

        int index = searchInsert(nums, target);
        System.out.println("Target should be at index : " + index);
    }
}
