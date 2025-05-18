// public class Loop {
//     public static void main(String args[]){
//         int i = 0;
//         while (i <= 5){
//             System.out.print(i + " ");
//             i++;
//         }
//     }
// }

// import java.util.*;

// public class Loop{
//     public static void main(String agrs[]){
//         Scanner sc = new Scanner(System.in);
//         int rang = sc.nextInt();
//         int i = 1;

//         while (i <= rang){
//             System.out.print(i + " ");
//             i++;
//         }
//     }
// }


// public class Loop{
//     public static void main(String args[]){
//         int n = 270703;
        
//         while( n > 0){
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n / 10;//n/=10
//         }
//         System.out.println();
//     }
// }


// public class Loop{
//     public static void main(String args[]){
//         int n = 270703;
//         int rev = 0;
        
//         while( n > 0){
//             int lastDigit = n % 10;
//             rev = (rev*10) + lastDigit;
//             n = n / 10;//n/=10
//         }
//         System.out.println(rev);
//     }
// }


// import java.util.*;

// public class Loop{
//     public static void main(String args[]){
//         int counter = 1;
//         do{
//             System.out.println("Hello world " );
//             counter++;
//         }while(counter <= 10);
//     }
// }


// import java.util.*;

// public class Loop{
//     public static void main(String args[]){
//         for (int i =1; i<=5; i++){
//             if(i ==3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("Loop ended");
//     }
// }


// import java.util.*;
// public class Loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("enter your number :");
//             int n = sc.nextInt();
//             if(n % 10 == 0){
//                 break;
//             }
//             System.out.println("Your number is : " + n);
//         }while(true);
//         System.out.println("Loop ended");
//     }
// }


// public class Loop{
//     public static void main(String args[]){
//         for (int i=1; i<=5; i++){
//             if (i == 3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
//}


// import java.util.*;

// public class Loop{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);

//         do{
//             System.out.print("Enter your number : ");
//             int n = sc.nextInt();
//             if (n % 10 == 0){
//                 continue;
//             }
//             System.out.println("Your number is : " + n);
//         }while(true);
//     }
// }


// import java.util.*;
// public class Loop {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         if (n == 2){
//             System.out.println(n + " is a prime number");
//         } else{
//             boolean isPrime = true;
//         for(int i = 2; i<=n-1; i++){
//             if(n % i == 0){
//                 isPrime = false;
//             }
//         }

//         if (isPrime){
//             System.out.println(n + " is a prime number");
//         }else{
//             System.out.println(n + " is not a prime number");
//         }
//         }
        
//     }
// }


// public class Loop{
//     public static void main(String[] args){
//         for (int i=0; i<5; i++){
//             System.out.println("Hello");
//             i+=2;
//         }
//     }
// }



// import java.util.Scanner;

// public class Loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;

//         do {
//             System.out.print("Enter the number: ");
//             number = sc.nextInt();

//             // Check if the number is even or odd
//             if (number % 2 == 0) {
//                 evenSum += number;  // Add to even sum
//             } else {
//                 oddSum += number;   // Add to odd sum
//             }

//             System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
//             choice = sc.nextInt();

//         } while (choice == 1);  // Continue if choice is 1

//         // Print the sums of even and odd numbers
//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);

//         sc.close();  // Close the scanner
//     }
// }


// import java.util.Scanner;

// public class Loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Ask user to enter a number
//         System.out.print("Enter a number to find its factorial: ");
//         int num = sc.nextInt();

//         int factorial = 1; 

//         // Check if the number is negative
//         if (num < 0) {
//             System.out.println("Factorial is not defined for negative numbers.");
//         } else {
//             // Calculate factorial using loop
//             for (int i = 1; i <= num; i++) {
//                 factorial *= i;
//             }

//             // Display the result
//             System.out.println("Factorial of " + num + " is: " + factorial);
//         }

//         sc.close();
//     }
// }

import java.util.*;
public class Loop{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of" + fact);
    }
}


// import java.util.*;

// public class Loop{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for ( int i=1; i<=10; i++){
//             int result = n * i;
//             System.out.println(n + " * " + i + " = " + result);
//         }
//     }
//}



// import java.util.*;

// public class Loop{
//     public static void main(String args[]){
//          for ( int i=1; i<=100; i+=2){     //for(int i=1; i<=100; i++)
//             System.out.print(i +" ");     //if (i%2!=0)
//          }                                //System.out.print(i + " ");
//     }
// }



// import java.util.*;
// public class Loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         while(true){
//             System.out.println("Enter the no.:");
//             int n = sc.nextInt();
//             if (n==0){
//                 break;
//             }
//             System.out.println("The no. is: " + n);
//         }
//     }
// }