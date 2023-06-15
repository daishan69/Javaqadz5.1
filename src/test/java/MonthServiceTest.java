import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqadz5.MonthService;

public class MonthServiceTest {

    @Test
    public void testVacationPoor () {
        MonthService service = new MonthService();
        int income;
        int expenses;
        int threshold;
        int expected = 3;
        int aktual = service.calcMonth(income = 10_000 , expenses = 3_000 ,threshold = 20_000 );

        Assertions.assertEquals(expected , aktual);

    }
    @Test
    public void testVacationRich () {
        MonthService service = new MonthService();
        int income;
        int expenses;
        int threshold;
        int expected = 2;
        int aktual = service.calcMonth(income = 100_000, expenses = 60_000, threshold = 150_000);

        Assertions.assertEquals(expected, aktual);
    }





    }
