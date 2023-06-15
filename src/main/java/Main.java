import ru.netology.javaqa.javaqadz5.MonthService;

public class Main {
    public static void main(String[] args) {
        MonthService service = new MonthService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int money = (income - expenses);
        int month;
        int count = service.calcMonth(income = 10_000 , expenses = 3_000 ,threshold = 20_000 );

        System.out.println(count);



    }
}
