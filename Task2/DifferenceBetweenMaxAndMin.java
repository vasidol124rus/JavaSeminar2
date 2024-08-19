
public class DifferenceBetweenMaxAndMin {

    public static void main(String[] args) {
        int[] numbers = {10, 2, 5, 8, 1};
        int difference = differenceBetweenMaxAndMin(numbers);
        System.out.println("Разница: " + difference); // Вывод: 9
    }
    
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
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);

        return max - min;
        
    }
}

    

