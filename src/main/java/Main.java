public class Main {
    public static void main(String[] args) {
        BonusService bonusService = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long bonus = bonusService.calculate(amount, registered);

        System.out.println("Начальная сумма: " + amount);
        System.out.println("Зарегистрированный: " + registered);
        System.out.println("Начисленный бонус: " + bonus);
    }
}

