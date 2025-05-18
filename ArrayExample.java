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



public class ArrayExample{
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



    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;


        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){//print
                    //subarrays sum
                    currSum += numbers[k];
                }
                System.out.println(currSum );//subarrays
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum ="+ maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);
    }

 }