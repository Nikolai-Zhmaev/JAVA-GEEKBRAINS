package ru.geekbrains.MyPractice;

public interface LinkedList extends Iterable <Integer> {

    int removeFirst (); // метод для удаления первого элементов

    void insertFirst (int value); // метод для добавления первого элементов

    Integer getFirstElement (); // метод для получения первого элемента (Integer для возможности возврата null если нет элементов)

    boolean isEmpty (); // метод проверки пустой ли лист

    int detSize (); // метод для получения размера списка

    void display (); //метод для вывода элементов

    boolean find (int value); // метод поиска элемента в списке

    boolean remove (int value); // метод для удаления элемента

    Item getFirstItem ();
}
