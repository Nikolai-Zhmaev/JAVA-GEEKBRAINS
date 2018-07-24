package ru.geekbrains.MyPractice;

public interface Queue {

    int removeFirst(); // метод удаления элемента слева

    void insertLast(int value); // метод добавления элемента справа

    int getSize(); // метод для получения размера очереди

    boolean isEmpty(); // метод для проверки очереди на пустоту

    boolean isFull();  // метод для проверки очереди на заполненность


}
