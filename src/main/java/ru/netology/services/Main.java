package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        BonusCount service = new BonusCount();
        int count = service.calcCount(10_000, 3_000, 20_000);
        System.out.println("Количество месяцев отдыха " + count);
    }
}
