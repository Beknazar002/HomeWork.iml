public class Main {
    public static void main(String[] args) {
        String multiWordString;
        String word = "значение";
        final int NUM = 41 ;

        multiWordString = NUM + word;
        System.out.println( word + " " + NUM + " " );

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
    }
}

