// public class Test {
//     public static void main(String[] args){
//         int x = 2, y = 5;
//         int exp1 = (x * y / x);
//         int exp2 = (x * (y / x));
//         System.out.print(exp1 + ",");
//         System.out.println(exp2);
//     }
// }

// public class Test {
//     public static void main (String[] args){
//         int x = 200, y = 50, z= 100;
//         if(x > y && y > z){
//             System.out.println("Hello");
//         }
//         if(z > y && z < x){
//             System.out.println("Java");
//         }
//         if((y+200) < x && (y+150) < z){
//             System.out.println("Hello Java");
//         }
//     }
// }


// public class Test{
//     public static void main (String[]args){
//         int x, y, z;
//         x = y = z = 2;
//         x +=y;
//         y-= z;
//         z /= (x + y);
//         System.out.println(x +" " + y + " " + z);
//     }
// }

// public class Test{
//     public static void main (String[]args){
//         int x = 9, y = 12;
//         int a = 2, b = 4, c = 6;

//         int exp = 4/3 * (x+34) + 9 * (a=b*c) + (3+y*(2+a)) / (a+b*y);
//         System.out.println(exp);
//     }
// }

// public class Test{
//     public static void main (String[]args){
//         int x = 10, y = 5;

//         int exp1 = (y * (x/ y + x / y));
//         int exp2 = (y * x / y + y * x / y);
//         System.out.println(exp1);
//         System.out.println(exp2);
//     }
// }

// import java.util.*;
// public class Test{
//     public static void main (String[]args){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();

//         if (a > 0){
//             System.out.println("Positive");
//     }   else if (a < 0){
//             System.out.println("Negative");
//     }   else if (a == 0){
//             System.out.println("Zero");
//     }   else {
//             System.out.println("Invalid Input");
//     }
//     }
// }


// public class Test{
//     public static void main(String[]args){
//         double temp = 103.5;

//         if (temp > 100){
//             System.out.println("I have a Fever");
//         } else if (temp < 100){
//             System.out.println("I don't have a Fever");
//         } else if (temp == 100){
//             System.out.println("Normal Temperature");
//         } else {
//             System.out.println("Invalid Input");
//         }
//     }
// }


// public class Test{
//     public static void main(String args[]) {
//         int a = 63,b=36;
//         boolean x = (a < b) ? true:false;
//         int y = (a > b) ? a:b;
//     }
// }    


// import java.util.*;
// public class Test{
//     public static void main (String[]args){
//         Scanner sc = new Scanner (System.in);
//         int year = sc.nextInt();

//         if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
//             System.out.println("Leap Year");
//         } else {
//             System.out.println("Not a Leap Year");
//         }
//     }
// }        



// import java.util.*;
// public class Test{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         switch (n) {
//             case 1:
//               System.out.println("Monday");
//               break;
//             case 2:
//               System.out.println("Tuesday");
//               break;
//             case 3:
//               System.out.println("Wednesday");
//               break;
//             case 4:
//               System.out.println("Thursday");
//               break;
//             case 5:
//               System.out.println("Friday");
//               break;
//             case 6:
//               System.out.println("Saturday");
//               break;
//             case 7:
//               System.out.println("Sunday");
//               break;
//           }
//     }
// }



import java.util.*;

public class Test{
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n > 0){
      System.out.println("positive");
    }else if(n < 0){
      System.out.println("negative");
    }else if (n == 0){
      System.out.println("zero");
    }
  }
}