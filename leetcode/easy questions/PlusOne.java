public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // Agar current digit 9 se chhoti hai
            if (digits[i] < 9) {
                digits[i]++; // 1 add karo
                return digits; // Done! Return updated array
            }

            // Agar 9 hai, toh 0 bana do (carry next digit ko milega)
            digits[i] = 0;
        }

        // Agar loop ke baad bhi return nahi hua, matlab sab digits 9 the
        // e.g. 999 → 1000
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Pehla digit 1, baaki sab 0 by default
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] result = plusOne(digits);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

//output: Result: 1 2 4
// Explanation: Last digit 3 ko 1 add kiya, toh 4 ban gaya
