import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int totalSum = calculateSumRecursive(numbers, 0);
        System.out.println(totalSum);
    }

    public static int calculateSumRecursive(List<Integer> nums, int index) {
        if (index == nums.size()) {
            return 0;
        }
        return nums.get(index) + calculateSumRecursive(nums, index + 1);
    }
}