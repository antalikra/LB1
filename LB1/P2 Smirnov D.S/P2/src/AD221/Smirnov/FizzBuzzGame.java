package AD221.Smirnov;

public class FizzBuzzGame
{
    public static void main(String[] args)
    {
        playFizzBuzz(); // Викликаємо метод для гри FizzBuzz
    }

    // Метод для гри FizzBuzz
    public static void playFizzBuzz()
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz"); // Виводимо "FizzBuzz", якщо число кратне і 3, і 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Виводимо "Fizz", якщо число кратне 3
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Виводимо "Buzz", якщо число кратне 5
            } else {
                System.out.println(i); // Виводимо саме число, якщо воно не кратне ні 3, ні 5
            }
        }
    }
}
