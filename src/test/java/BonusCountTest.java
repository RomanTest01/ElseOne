import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.BonusCount;

public class BonusCountTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void test(int income, int expense, int threshold) {
        BonusCount service = new BonusCount();
        int count = service.calcCount(income, expense, threshold);
        System.out.println("Количество месяцев отдыха " + count);
    }
}
