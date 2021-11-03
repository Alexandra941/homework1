package kalashnikova;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    private static void checkSumSign() {
        int a = 4;
        int b = -2;

        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная" );
    }

    private static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
            return;
        }
        if (value <= 100) {
            System.out.println("Желтый");
            return;
        }

        System.out.println("Зеленый");
    }

    private static void compareNumbers() {
        int a = 2;
        int b = 3;

        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}