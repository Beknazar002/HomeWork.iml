public class Main {
    public static void main(String[] args) {

        System.out.println(checkWeather(25, 10));
        System.out.println(checkWeather(18, 25));
        System.out.println(checkWeather(50, 5));
        System.out.println(checkWeather(30, 35));
        System.out.println(checkWeather(40, 20));  
    }

    public static String checkWeather(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}
