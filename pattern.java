// public class Pattern {
//     public static void main(String args[]){
//         for(int line = 1; line<=4; line++){

//             for(int star = 1; star<=line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }


// public class Pattern {
//     public static void main(String args[]){
//         int n = 4; // Number of lines in the pattern
//         for(int line = 1; line<=n; line++){

//             for(int star = 1; star<=n-line+1; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }


// public class Pattern {
//     public static void main(String args[]){
//         int n = 4; // Number of lines in the pattern
//         for(int line = 1; line<=n; line++){

//             for(int num = 1; num<=line; num++){
//                 System.out.print(num);
//             }
//             System.out.println();
//         }
        
//     }
// }


// public class Pattern {
//     public static void main(String args[]){
//         int n = 4; // Number of lines in the pattern
//         for(int line = 1; line<=n; line++){

//             for(int num = 1; num<=line; num++){
//                 System.out.print(num);
//             }
//             System.out.println();
//         }
        
//     }
// }



// public class Pattern {
//     public static void main(String args[]){
//         int n = 4; // Number of lines in the pattern
//         char ch = 'A'; // Starting character

//         //outer loop
//         for(int line = 1; line<=n; line++){
//                //inner loop
//             for(int chars = 1; chars<=line; chars++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
        
//     }
// }


// public class Pattern{
//     public static void main(String args[]){
//         int n = 7;  //lines
        

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Pattern{
//     public static void main(String args[]){
//         int n = 4;  //lines
        

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n-1; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Pattern{
//     public static void main(String args[]){
//         int n = 5;

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
    // * 
    // * * 
    // * * * 
    // * * * * 
    // * * * * * 


        // for(int i=1; i<=n; i++){
        //     int num_spaces = i-1;
        //     int num_stars = n-num_spaces;

        //     for(int j=1; j<=num_spaces; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=num_stars; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();;
        // }
        // }

//     * 
//    * * 
//   * * *
//  * * * *
// * * * * *

        // for(int i=1; i<=n; i++){
        //     int num_spaces = n-i;

        //     for(int j=1; j<=num_spaces; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }

        //     for(int j=i-1; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();

        //  }

//     1
//    121
//   12321
//  1234321
// 123454321    


        // int num=1;
        // for(int i=1; i<=n; i++){
        //     int num_spaces = n-i;

        //     for(int j=1; j<=num_spaces; j++){
        //         System.out.print("\t");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print(num + "\t\t");
        //         num++;
        //     }
        //     System.out.println();

        //  }
//                                 1
//                         2               3
//                 4               5               6
//         7               8               9               10
// 11              12              13              14              15       


//         for(int i=1; i<=n; i++){
//             int num_spaces = n-i;
//             int num_stars = (2*i)-1;

//             for(int j=1; j<=num_spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=num_stars; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i=n-1; i>=1; i--){
//             int num_spaces = n-i;
//             int num_stars = (2*i)-1;

//             for(int j=1; j<=num_spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=num_stars; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
// 1
// 01
// 101
// 0101
// 10101


//         //printing pattern in different way
//         //Top right Triangle
//         for(int r= 1; r <= n; r++){
//             for(int c=1; c<=n; c++){
//                 if(r - c <= 0){
//                     System.out.print("*");
//             }else{
//                     System.out.print(" ")}
//         }
//         System.out.println();
//     }


//     //Bottom left Triangle
//     for(int r = 1; r <= n; r++) {
//     for(int c = 1; c <= n; c++) {
//         if(c <= r) {
//             System.out.print("*");
//         }
//     }
//     System.out.println();
// }
    
    //top left triangle
    // for(int r = 1; r <= n; r++){
    //     for(int c = 1; c <= n; c++){
    //         if(r + c <= n + 1){
    //             System.out.print("*");
    //         }else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }


    // //bottom right triangle
    // for(int r = 1; r <= n; r++){
    //     for(int c = 1; c <= n; c++){
    //         if(r + c >= n + 1){
    //             System.out.print("*");
    //         }else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }


    //bottom left
    // for(int r = 1; r <= n; r++){
    //     for(int c = 1; c <= n; c++){
    //         if(r - c >=0){
    //             System.out.print(r);
    //         }else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }


    //floyd's triangle
    // int count = 1;
    //     for(int r = 1;r <=n; r++){
    //         for(int c = 1; c <= r; c++){
    //             if( r - c >= 0){
    //                 System.out.print(count);
    //         }else{
    //                 System.out.print(" ");
    //             }
    //             count++;
    //         }
    //     }
    //     System.out.println();

    //hollow square
//     for(int r = 1; r <= n; r++){
//         for(int c = 1; c <= n; c++){
//             if(r == 1 || r == n || c == 1 || c == n){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }

//  }
// }


