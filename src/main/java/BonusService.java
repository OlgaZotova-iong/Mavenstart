public class BonusService {
    public long calculate(long amount, boolean registered) {
        long bonus;
        if (registered) {
            bonus = amount / 100; // 1% для зарегистрированных
        } else {
            bonus = amount / 100; // 1% для незарегистрированных
        }

        // Устанавливаем лимит
        if (bonus > 500) {
            return 500; // максимум бонуса
        }
        return bonus; // возвращаем рассчитанный бонус
    }
}
