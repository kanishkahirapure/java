public class String2 {
    public static void main(String args[]){
        String fullName = "Tony Stark";
        System.out.println(fullName.length()); // Prints the length of the string
        System.out.println(fullName.toUpperCase()); // Converts the string to uppercase
        System.out.println(fullName.toLowerCase()); // Converts the string to lowercase
        System.out.println(fullName.indexOf("S")); // Finds the index of the first occurrence   
        System.out.println(fullName.indexOf("o")); // Finds the index of the first occurrence of 'o'
        System.out.println(fullName.indexOf("z")); // Returns -1 since 'z'
        // is not present in the string
        System.out.println(fullName.substring(0, 4)); // Extracts substring from index
        // 0 to 3 (4 is exclusive)
        System.out.println(fullName.replace("Tony", "Iron")); // Replaces "Tony" with "Iron"
        System.out.println(fullName.contains("Stark")); // Checks if "Stark" is present in the string
        System.out.println(fullName.startsWith("Tony")); // Checks if the string starts with "Tony"
        System.out.println(fullName.endsWith("Stark")); // Checks if the string ends with "Stark"
        System.out.println(fullName.trim()); // Removes leading and trailing whitespace 
        System.out.println(fullName.isEmpty()); // Checks if the string is empty
        System.out.println(fullName.equals("Tony Stark")); // Checks if the string is equal to "Tony Stark"
        System.out.println(fullName.equalsIgnoreCase("tony stark")); // Checks if the string is equal to "tony stark" ignoring case
        System.out.println(fullName.charAt(0)); // Gets the character at index 0
        System.out.println(fullName.charAt(5)); // Gets the character at index 5
    }
}
