package ru.geekbrains.MyPractice;

public interface Queue {

    void insert(int value); // метод для добавления элемента в очередь

    int remove();  // метод для удаления элемента из очереди

    int getSize(); // метод для получения размера очереди

    boolean isEmpty(); // метод для проверки очереди на пустоту

    boolean isFull();  // метод для проверки очереди на заполненность



}
