import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // Подготавливаем данные:
        long amount = 1000; // 1000 рублей
        boolean registered = false; // незарегистрированный пользователь
        long expected = 10; // ожидаемый бонус (1% от 1000)

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
