public class Task7{

    public static void main(String[] args) {
        String sentence = "recursion is replacing the repetition of loops";
        char target = 'r';

        System.out.println("Counting occurrences of '" + target + "' with a loop...");

        // --- START OF BLOCK TO REPLACE ---
    int count = countCharRecursive(sentence, target, 0);

        // --- END OF BLOCK TO REPLACE ---

        System.out.println("The character '" + target + "' appears " + count + " times.");
    }

    // TODO: Create a public static int countCharRecursive(String text, char target, int index) function here.
public static int countCharRecursive(String text,char target, int index){
    if (index >= text.length()){
    return 0;
    }
int match = (text.charAt(index) == target) ? 1:0;
    return match + countCharRecursive(text, target, index + 1);
}
}