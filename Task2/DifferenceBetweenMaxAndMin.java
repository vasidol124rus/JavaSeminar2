
public class DifferenceBetweenMaxAndMin {

    public static int differenceBetweenMaxAndMin(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return max - min;
    }
}

    

