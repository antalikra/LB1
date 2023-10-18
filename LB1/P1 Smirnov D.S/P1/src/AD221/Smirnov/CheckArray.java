package AD221.Smirnov;

import java.util.Scanner;

public class CheckArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Введення кількості елементів у масиві
        System.out.print("Введіть кількість елементів у масиві: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Введення елементів масиву
        for (int i = 0; i < n; i++) {
            System.out.print("Введіть " + (i + 1) + "-й елемент: ");
            arr[i] = scanner.nextInt();
        }

        // Виклик методу для перевірки масиву
        boolean result = checkArray(arr);

        // Виведення результату
        if (result) {
            System.out.println("Усі елементи масиву більше або дорівнюють попередньому.");
        } else {
            System.out.println("Масив не відповідає умові.");
        }

        scanner.close();
    }

    // Метод, що перевіряє, чи кожен елемент масиву більший або дорівнює попередньому
    public static boolean checkArray(int[] arr)
    {
        if (arr.length < 2) {
            // Якщо в масиві менше 2 елементів, повертаємо false
            return false;
        }

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < arr[i - 1])
            {
                // Якщо знайдено елемент, який менший за попередній, повертаємо false
                return false;
            }
        }

        // Якщо жоден елемент не менший за попередній, повертаємо true
        return true;
    }
}

