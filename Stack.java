package ru.geekbrains.MyPractice;

public interface Stack {

    void push(char value); // метод для добавления элемента в стек

    char peek(); // метод для получения элемента стека

    char pop(); // метод для удаления элемента из стека

    int getSize(); // метод для получения размера стека

    boolean isEmpty(); // метод для проверки стека на пустоту

    boolean isFull(); // метод для проверки стека на заполненность

}
