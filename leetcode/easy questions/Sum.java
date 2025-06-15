import java.util.HashMap;

class Sum {
    public int[] twoSum(int[] nums, int target) {
        // Step 1: Map banate hain jisme value → index store hoga
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2: Array ke har element par loop
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Jo value chahiye target complete karne ke liye

            // Step 3: Check karo ki woh value pehle se map me hai kya
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i}; // Answer mil gaya
            }

            // Step 4: Agar nahi mila, to current number ko map me daal do
            map.put(nums[i], i);
        }

        return new int[] {}; // Ye line kabhi reach nahi hogi as per question condition
    }
}




