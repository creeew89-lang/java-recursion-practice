public class Task2{
    public static void main(String[] args) {
        String original = "Hello world";
        System.out.println("Reversing String using recursion");

String reversed = reversedStringRecursion(original);

        System.out.println("Original " + original);
        System.out.println("Reversed " + reversed);
    }

    public static String reversedStringRecursion(String str){
        if(str == null || str.length() <= 1){
            return str;
        }
return reversedStringRecursion(str.substring(1)) + str.charAt(0);
    }
}