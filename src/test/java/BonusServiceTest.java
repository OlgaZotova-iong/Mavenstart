import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForNotRegisteredAndEqualToLimit () {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50_000; // Сумма, при которой бонус равен лимиту
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку:
        Assertions.assertEquals(expected, actual);
    }
}