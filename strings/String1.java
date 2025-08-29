// public class String1 {
//     public static void printLetters(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println(); // For new line after printing
//     }

//     public static void main(String args[]) {
//         String firstName = "Kanishka";
//         String lastName = "Hirapure";
//         String fullName = firstName + " " + lastName;
//         printLetters(fullName);
//     }
// }


// public class String1 {
//     public static boolean isPalindrome(String str){
//         for(int i = 0; i < str.length() / 2; i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n - 1 - i)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]){
//         String str = "racecar";
//         if(isPalindrome(str)) {
//             System.out.println(str + " is a palindrome.");
//         } else {
//             System.out.println(str + " is not a palindrome.");
//         }
//     }
// }


// public class String1{
//     public static boolean isPalindrome(String str) {
//         int start = 0;
//         int end = str.length() - 1;

//         while (start < end) {
//             if (str.charAt(start) != str.charAt(end)) {
//                 return false;
//             }
//             start++;
//             end--;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         String input = "madam";
//         System.out.println("Is palindrome: " + isPalindrome(input));
//     }
// }


public class String1{
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println(); // For new line after printing
    }

    public static void main(String args[]) {
        String firstName = "Kanishka";
        String lastName = "Hirapure";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);
    }
}