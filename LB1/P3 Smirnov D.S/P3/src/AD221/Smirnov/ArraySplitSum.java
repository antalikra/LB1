package AD221.Smirnov;

import java.util.Scanner;

public class ArraySplitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть елементи масиву через пробіл: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] nums = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
        }

        boolean result = canSplitArray(nums);

        if (result) {
            System.out.println("Масив можна розділити на дві частини з однаковими сумами.");
        } else {
            System.out.println("Масив не можна розділити на дві частини з однаковими сумами.");
        }
    }

    public static boolean canSplitArray(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum / 2;
        return canPartition(nums, 0, 0, targetSum);
    }

    public static boolean canPartition(int[] nums, int index, int currentSum, int targetSum) {
        if (currentSum == targetSum) {
            return true;
        }

        if (index == nums.length || currentSum > targetSum) {
            return false;
        }

        if (canPartition(nums, index + 1, currentSum + nums[index], targetSum)) {
            return true;
        }

        return canPartition(nums, index + 1, currentSum, targetSum);
    }
}
