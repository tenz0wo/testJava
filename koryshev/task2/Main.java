package ru.koryshev.task2;

public class Main {
    public static void main(String[] args) {
        try {
            Pool pool1 = new Pool("Адрес1", "Бассейн1", 80, 4);
            Pool pool2 = new Pool("Адрес2", "Бассейн2", 120, 6);
            NewPool newPool = new NewPool("Адрес3", "Новый Бассейн", 150, 5, 2.5);

            System.out.println("Ширина бассейна 1: " + pool1.calculateWidth());
            System.out.println("Ширина бассейна 2: " + pool2.calculateWidth());

            // Обработка исключения для длины бассейна
            if (pool2.getLength() > 100) {
                throw new Exception("Длина бассейна 2 превышает 100!");
            }

            System.out.println("Глубина нового бассейна: " + newPool.getDepth());
        } catch (Exception e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
