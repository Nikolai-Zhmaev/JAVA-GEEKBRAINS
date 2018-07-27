package ru.geekbrains.MyPractice;

public class HomeWork4Main {

    public static void main(String[] args) {

       // проверяем работу итератора

        LinkedList list = new LinkedListImpl();


        list.insertFirst(1);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(11);

        for (Integer value: list) {
            System.out.println("value = " + value);

        }




    }
}
