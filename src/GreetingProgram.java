import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Привет, " + userName + "!");
    }
}
