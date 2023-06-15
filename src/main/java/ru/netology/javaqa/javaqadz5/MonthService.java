  package ru.netology.javaqa.javaqadz5;


public class MonthService {
    public int calcMonth(int income, int expenses, int threshold ) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold){
                count++;
                money = money - (money / 3 * 2);


            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
