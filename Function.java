// public class Function {
    
//         // method that adds two numbers
//         public static int add(int a, int b) {
//             return a + b;
//         }
    
//         public static void main(String[] args) {
//             int result = add(5, 10);
//             System.out.println("Sum: " + result);
//         }
    
    
// }



// public class Function{
//     public static int multiply(int a, int b){
//         int product = a * b;
//         return product;
//     }

//     public static void main(String args[]){
//         int a = 3;
//         int b = 5;
//         int prod = multiply(a,d);
//         System.out.println("a * b =" + prod);
//         prod = multiply(10,20);
//         System.out.println("a * b =" + prod);
//     }
// }


// public class Function{

//     public static int factorial(int n){
//         int f = 1;

//         for(int i=1; i<=n; i++){
//             f = f * i;
//         }

//         return f;//factorial of n
//     }   

//     public static void main(String args[]){
//         System.out.println(factorial(4));
//     }
// }


//public class Function{

    // public static int sum(int a, int b){
    //     return a + b;
    // }    

    // public static int sum(int a, int b, int c){
    //         return a + b + c;
    //     }


    //function overloading


//     public static int sum(int a, int b){
//         return a + b;
//     }

//     public static float sum(float a, float b){
//         return a + b;
//     }
      

//     public static void main(String args[]){
//         System.out.println(sum(3,5));
//         System.out.println(sum(3.2f, 4.8f));
//     }
// }



// public class Function{

//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         for(int i=2; i<=n-1; i++){
//             if(n % i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }
//     public static void primesInRange(int n){
    
// for(int i=2; i<=n; i++){
//     if(isPrime(i)){
//         System.out.print(i + " ");
//     }
// }
// System.out.println();
// }

// public static void main(String args[]){
// primesInRange(20);
// }
// }




// public class Function{

//     public static void binToDec(int binNum){
//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while(binNum>0){
//             int lastDigit = binNum % 10;
//             decNum = decNum +(lastDigit * (int)Math.pow(2,pow));
//             pow++;
//             binNum = binNum / 10;
//         }
//         System.out.println("decimal of "+ myNum + " = " + decNum);
//     }

//     // public static void main(String[] args) {
//     //    binToDec(101);

//     public static void decToBin(int n){
//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;

//         while(n > 0){
//             int rem = n % 2;;
//             binNum = binNum + (rem * (int)Math.pow(10,pow));
//             pow++;
//             n = n/2;
//         }

//         System.out.println("binary of " + myNum + " = " + binNum);
//     }

//     public static void main(String[] args) {
//         decToBin(7);
//     }
// }



// public class Function{
//     public static int computeAverage(int a, int b, int c){
//         int sum = a + b + c;
//         int average = sum / 3;
//         return average;
//     }

//     public static void main(String args[]){
//         int average = computeAverage(10,20,30);
//         System.out.println("The average is:" + average);
//     }
// }




// public class Function{
//     public static boolean isEven(int n){
//         // if (n % 2 == 0){
//         //     return true;
//         // }else {
//         //     return false;
//         // }

//         return n % 2 == 0;
//     }

//     public static void main(String args[]){
//         int num = 4;
//         System.out.println(isEven(num));
//     }
// }



// public class Function {

//     public static boolean isPalindrome(int n) {
//         int original = n;
//         int reversed = 0;

//         // Reverse the number
//         while (n > 0) {
//             int digit = n % 10;
//             reversed = reversed * 10 + digit;
//             n = n / 10;
//         }

//         // Check if original and reversed are same
//         return original == reversed;
//     }

//     public static void main(String args[]) {
//         int num = 121;
//         System.out.println(isPalindrome(num));
//     }
// }



public class Function {

    // Method to compute sum of digits
    public static int sumDigits(int number) {
        int sum = 0; // Step a: initialize sum as 0

        while (number > 0) {
            int digit = number % 10; // Step b: find last digit
            sum = sum + digit;        // Step c: add digit to sum
            number = number / 10;     // Step d: remove last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum of digits: " + sumDigits(num));
    }
}
