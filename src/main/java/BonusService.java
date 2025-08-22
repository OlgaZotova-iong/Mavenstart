public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1; // 3% для зарегистрированных, 1% для незарегистрированных
        long bonus = amount * percent / 100; // расчет бонуса
        long limit = 500; // лимит на бонус
        if (bonus > limit) {
            bonus = limit; // если бонус превышает лимит, устанавливаем лимит
        }
        return bonus; // возвращаем рассчитанный бонус
    }
}

