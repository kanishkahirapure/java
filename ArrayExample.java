// import java .util.*;

// public class ArrayExample {
//     public static void main(String[]args){
//         int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         // int phy;
//         //phy = sc.nextInt();


//         System.out.print("Length of array : "+ marks.length );

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();    
//         marks[2] = sc.nextInt();

//         System.out.println("phy : " + marks[0]);
//         System.out.println("che : " + marks[1]);    
//         System.out.println("math : " + marks[2]);
//         //marks[2] = 100;    //update
//         marks[2] = marks[2] + 1; //update
//         System.out.println("math : " + marks[2]);

//         int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("Percentage : " + percentage + "%");
//         System.out.println("Total Marks : " + (marks[0] + marks[1] + marks[2]));

//     }
// }



// import java.util.*;

// public class ArrayExample{
//     public static void update(int marks[], int nonChangable){
//         nonChangable = 10;
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i] + 1; // update each element by adding 1
//         }
//     }

//     public static void main(String args[]){
//         int marks[] = {97, 98, 99};
//         int nonChangable =5;
//         update(marks , nonChangable); 
        
//         System.out.println(nonChangable); // 5

//         //print our marks
//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i] + " ");
//         }

//         System.out.println();
//     }
// }

// import java.util.*;
// public class ArrayExample{
//     //largest number in array

//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;  //-infinity
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<numbers.length; i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//             if(smallest > numbers[i]){
//                 smallest  = numbers[i];

//             }
//         }
//         System.out.println("smallest value is :" + smallest);
//         return largest;
//     }
//     public static void main(String args[]){
//         int numbers[] = {1, 2, 6, 3, 5};
//         System.out.println("largest value is :" + getLargest(numbers));
//     }
// }



//public class ArrayExample{
//     public static int binarySearch(int numbers[], int key){
//         int start = 0, end = numbers.length-1;
//         while(start <= end){
//             int mid = (start + end) /2;

//             //comparisons
//             if(numbers[mid] == key){//found
//                 return mid;
//             }
//             if(numbers[mid] < key){//right
//                 start = mid+1;
//             }else{
//                 end = mid-1; //left
//             }
//         }   
//         return -1; //not found
//     }

//     public static void main(String agr[]){
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 10;
        
//         System.out.println("index for key is : " + binarySearch(numbers, key));
//     }
   
//     public static void reverse(int number[]){
//         int first = 0, last = number.length-1;

//         while(first < last){
//             //swap
//             int temp = number[last];
//             number[last] = number[first];
//             number[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String args[]){
//         int number[] = {1, 2, 3, 4, 5};
//         reverse(number);

//         //print
//         for(int i=0; i<number.length; i++){
//             System.out.print(number[i] + " ");
//         }

//         System.out.println();
//     }


    // public static void printPairs(int numbers[]){
    //     int tp = 0; //total pairs;
    //     for(int i=0; i<numbers.length; i++){
    //         int curr = numbers[i];  //1, 2, 3, 4, 5
    //         for(int j=i+1; j<numbers.length; j++){
    //             System.out.print("(" + curr + "," + numbers[j] + ")");
    //             tp++;
    //         }

    //         System.out.println();
    //     }
    //     System.out.println("Total pairs are : " + tp);
    // }
    // public static void main(String args[]){
    //     int numbers[] = {1, 2, 3, 4, 5};
    //     printPairs(numbers);
    // }



    // public static void printSubarrays(int numbers[]){
    //     int ts = 0;
    //     for(int i=0; i<numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             for(int k=start; k<=end; k++){//print
    //                 System.out.print(numbers[k]+" ");//subarrays
    //             }
    //             ts++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }

    //     System.out.println("total subarrays ="+ ts);
    // }

    // public static void main(String args[]){
    //     int numbers[] = {2, 4, 6, 8, 10};
    //     printSubarrays(numbers);
    // }



    // public static void maxSubarraySum(int numbers[]){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int [numbers.length];

    //     prefix[0] = numbers[0];
    //     //calculare prefix array
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }

    //     for(int i=0; i<numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;

    //             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
    //     }

    //     System.out.println("Max sum ="+ maxSum);
    // }

//     public static void main(String args[]){
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSubarraySum(numbers);
//     }


// public static void maxSubarraySum(int numbers[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int [numbers.length];

//         prefix[0] = numbers[0];
//         //calculare prefix array
//         for(int i=1; i<prefix.length; i++){
//             prefix[i] = prefix[i-1] + numbers[i];
//         }

//         for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }

//         System.out.println("Max sum ="+ maxSum);
//     }

//     public static void kadanes(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<numbers.length; i++){
//             cs = cs + numbers[i];
//             if(cs < 0){
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }

//         System.out.println("our max subarray sum is : "+ ms);
//     }

//     public static void main(String args[]){
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadanes(numbers);
//     }
    


// public static int trappedRainwater(int height[]){
//     int n = height.length;
//     //calculate left max boundary - array
//     int leftMax[] = new int[n];
//     leftMax[0] = height[0];
//     for(int i=1; i<n; i++){
//         leftMax[i] = Math.max(leftMax[i-1], height[i]);
//     }

//     //calculate right max boundary - array
//     int rightMax[] = new int[n];
//     rightMax[n-1] = height[n-1];
//     for(int i=n-2; i>=0; i--){
//         rightMax[i] = Math.max(rightMax[i+1], height[i]);
//     }
    
//     int trappedWater = 0;
//     //loop
//     for(int i=0; i<n; i++){
//         //waterLevel = min(leftmax bound, rightmax bound)
//         int waterLevel = Math.min(leftMax[i], rightMax[i]);

//         //trapped water = waterlevel - height[i]
//         trappedWater += waterLevel - height[i];
//     }

//     return trappedWater;

// }

//    public static void main(String args[]){
//     int height[] = {4, 2, 0, 6, 3, 2, 5};
//     System.out.println(trappedRainwater(height));
//    }
 // }

import java.util.*;
 // search in rotated array 33
  public class ArrayExample{
    public int search(int nums[], int target){
        int n = nums.length;

        int low = 0;
        int high = n-1;

        while(low <= high){
            
            int mid = (low + high)/2;
            if(nums[mid] == target) 
            return mid;

            else if(nums[low]<= nums[mid]){
                if (target >= nums [low] && target <= nums[mid])
                high = mid-1;
                else
                low = mid + 1;
            } else{
                
                if(target >= nums[mid + 1] && target <= nums[high])
                low = mid+1;
                else
                high = mid-1;

            }
        }
        return -1;
    }


//trapping rain water
    public int trap(int[] height){
        int n = height.length;

        int lmax = height[0];
        int rmax = height[n-1];

        int low = 1;
        int high = n-2;
        int ans = 0;

        while(low <= high){

            lmax = Math.max(lmax,height[low]);
            rmax = Math.max(rmax,height[high]);

            if(lmax < rmax){
                low++;
            }else{
                ans += rmax - height[high];
                high--;
            }
        }

        return ans;
    }


    //3sum 15

    
    public List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);//sort the array
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        int low = 0;
        int high = n - 1;
        int mid = high - 1;

        while(high >= 2){
            while(low <mid){
                int sum = nums[low] + nums[mid] + nums[high];

                if(sum == 0){
                    //add the triplet to the set to avoid duplicates
                    set.add(Arrays.asList(nums[low], nums[mid], nums[high]));
                    low++;
                    mid--;
                }else if(sum > 0){
                    mid--;
                }else{
                    low++;
                }
            }

            high--; //move to the next potential "high"value
            mid = high - 1; //rest mid to just before high
            low = 0; // rest low to the start
        }

        //convert the set to a list for the result
        result.addAll(set);
        return result;
    }


  }