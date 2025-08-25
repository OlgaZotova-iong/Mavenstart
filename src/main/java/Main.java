public class Main {
    public static void main(String[] args) {
        BonusService bonusService = new BonusService();

        long amount = 50_000;
        boolean registered = false;
        long bonus = bonusService.calculate(amount, registered);

        System.out.println("Бонус для незарегистрированного пользователя (сумма 50000): " + bonus);
    }
}