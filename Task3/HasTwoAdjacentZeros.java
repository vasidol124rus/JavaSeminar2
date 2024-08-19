
public class HasTwoAdjacentZeros {

    public static boolean hasTwoAdjacentZeros(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0 && numbers[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 0, 0, 3};
        boolean hasZeros1 = hasTwoAdjacentZeros(numbers1);
        System.out.println(hasZeros1); // Вывод: true

        int[] numbers2 = {1, 2, 0, 3, 0};
        boolean hasZeros2 = hasTwoAdjacentZeros(numbers2);
        System.out.println(hasZeros2); // Вывод: false
    }
}