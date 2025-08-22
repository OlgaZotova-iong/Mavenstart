public class Main {
    public static void main(String[] args) {
        BonusService bonusService = new BonusService();

        // Пример данных для подсчета бонусов
        long amount = 1000; // 1000 рублей
        boolean registered = false; // незарегистрированный пользователь

        // Вызываем метод и получаем бонус
        long bonus = bonusService.calculate(amount, registered);

        // Выводим результат
        System.out.println("Начисленный бонус: " + bonus + " рублей."); // Ожидаемый результат: 10 рублей
    }
}


