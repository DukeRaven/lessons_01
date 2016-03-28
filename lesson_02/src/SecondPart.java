import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kirill on 24.03.2016.
 */
public class SecondPart {

    private static float addition(float[] arr) {
        float result = 0;
        for (float i: arr)
            result += i;
        return result;
    }

    private static float subtraction(float[] arr) {
        float result = arr[0];
        for (int i = 1; i < arr.length; i++)
            result -= arr[i];
        return result;
    }

    private static float multiplication(float[] arr) {
        float result = arr[0];
        for (int i = 1; i < arr.length; i++)
            result *= arr[i];
        return result;
    }
    private static float division(float[] arr) {
        float result = arr[0];
        for (int i = 1; i < arr.length; i++)
            result /= arr[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString;
        String[] inputArray;
        String[] actions = {"+", "-", "/", "*"};
        float[] numbers;
        float result = 0;

        sc.useDelimiter("\n");


        System.out.println("Это калькулятор Java");

        while (true) {
            System.out.print("Введите операцию(+,-,*,/) и цифры(y-для выхода):");

            inputString = sc.next();
            inputArray = inputString.split("\\s+");

            if (inputArray[0].equalsIgnoreCase("y")) {
                System.out.println("Калькулятор OFF");
                break;
            }

            if (Arrays.binarySearch(actions, inputArray[0]) < 0) {
                System.out.println("Вы ввели не действие.");
                System.out.println("Возможные варианты: " + Arrays.toString(actions));
            }

            numbers = new float[inputArray.length - 1];

            // Checking numbers
            try {
                for (int i = 1; i < inputArray.length; i++) {
                    numbers[i -1] = Float.parseFloat(inputArray[i]);
                }
            } catch (Exception e) {
                System.out.println("Вы ввели не числа");
            }

            try {
                switch (inputArray[0]) {
                    case "+":
                        result = addition(numbers);
                        break;
                    case "-":
                        result = subtraction(numbers);
                        break;
                    case "/":
                        result = division(numbers);
                        break;
                    case "*":
                        result = multiplication(numbers);
                        break;
                }

                System.out.printf("Итог: %.0f\n", result);
            } catch (Exception e) {
                System.out.println("Что-то пошло не так во время вычислений.");
                System.out.println(e.toString());
            }
        }
    }
}
