package ru.netology.services;

public class BonusCount {
    public int calcCount(int income, int expense, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха

                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил - " + expense + ", затем еще - " + (((money - expense) * 2 / 3)));

                money = money - expense - (((money - expense) * 2 / 3));

            } else {

                System.out.println("Месяц " + month + ". Денег " + money + ". Придётся работать. Заработал + " + income + ", потратил - " + expense);
                money = money + income - expense;
            }
        }
        return count;
    }
}
