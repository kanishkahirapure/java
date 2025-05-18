// public class JavaBasics{
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//         System.out.println("Hello, World!");
//     }
// }
//boilerplate code for a basic Java program
// This program prints "Hello, World!" to the console

// public class JavaBasics{
//     public static void main(String[]args){
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String input = sc.next();
//         System.out.println(input);

//         String name = sc.nextLine();
//         System.out.println(name);

//         int number = sc.nextInt();
//         System.out.println(number);

//         float price = sc.nextFloat();
//         System.out.println(price);

//         double pricepoint = sc.nextDouble();
//         System.out.println(pricepoint);

//         boolean isTrue = sc.nextBoolean();
//         System.out.println(isTrue);


//     }
// }

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = a * b;
//         System.out.println(product);
//     }
// }

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float rad = sc.nextFloat();
//         float area = 3.14f * rad * rad;
//         System.out.println(area);
//     }
// }


//typecasting

// import java.util.*;
// public class JavaBasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 float a = 25.12f;
//                 int b = (int)a; //explicit typecasting
//                 System.out.println(b); // prints 25
//                 // float c = (float)b; //implicit typecasting
//         }
// }

// import java.util.*;
// public class JavaBasics{    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//            char a = 'a';
//            char b = 'b';
//            System.out.println((int)(b));
//            System.out.println((int)(a)); 
//            System.out.println(a);           
//            System.out.println(b-a);  
           
//     }
// }    


//In a program, input 3 numbers : A, B and C.You have to output the average of these 3 numbers 

// import java.util.*;
// public class JavaBasics{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int sum = a + b + c;
//         int avg = sum/3;
//         System.out.println(avg);
//     }
// }


//In a program, input the side of a square.You have to output the area of the square.

// import java.util.*;
// public class JavaBasics{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int areaOfSquare = a * a;
//         System.out.println(areaOfSquare);
//     }
// }


// import java.util.*;
// public class JavaBasics{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         float pencil = sc.nextFloat();
//         float pen = sc.nextFloat();
//         float eraser = sc.nextFloat();

//         float total = pencil + pen + eraser;
//         float gst = (total)*0.18f;
//         float totalBill = total + gst;

//         System.out.println("total cost is " + total);
//         System.out.println("total gst is " + gst);
//         System.out.println("total bill amount is " + totalBill);
//     }
// }


// import java.util.*;
// public class JavaBasics{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         byte b = 4;
//         char c = 'a';
//         short s = 512;
//         int i = 1000;
//         float f = 3.14f;
//         double d = 99.9954;
        
//         double result = (f * b) + (i % c) - (d * s);
//         System.out.println(result);

//     }
// }

// import java.util.*;
// public class JavaBasics{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         int $ = 24;
//         System.out.println($);

//     }
// 


// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // Input: integer
//         System.out.print("Enter an integer: ");
//         int number = sc.nextInt();
//         System.out.println("Original Integer: " + number);

//         // Conversion
//         float floatValue = number;
//         double doubleValue = number;
//         long longValue = number;

//         // Output
//         System.out.println("As Float: " + floatValue);
//         System.out.println("As Double: " + doubleValue);
//         System.out.println("As Long: " + longValue);
//     }
// }


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         int average = (a+b+c)/3;
//         System.out.println(average);
//     }
// }