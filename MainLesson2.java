package ru.geekbrains.MyPractice;

public class MainLesson2 {

    public static void main(String[] args) {

        /* реализуем программу для переворачивания строк (вынесем ее в отдельный класс, чтобы освободить main) и
         реализуем консольный ввод*/

        new StringRevers();

        System.out.println();


        // Работа с очередью. Здесь не стал ничего выдумывать нового, реализация как на уроке.

        System.out.println("Реализация очереди: ");

        Queue qu = new QueueImpl(5);

        addToQueue(qu, 1);
        addToQueue(qu, 2);
        addToQueue(qu, 3);
        addToQueue(qu, 4);
        addToQueue(qu, 5);
        addToQueue(qu, 6);

        while (!qu.isEmpty()) {
            System.out.println(qu.remove());
        }

/*       Работа с декой. Создадим отдельный класс Deque и унаследуемся от QueueImpl. Может и не лучшее решение, но
        решил поступить именно так*/

        System.out.println("Реализация деки: ");

        Deque deq = new Deque(5);

        // будем добавлять элементы с разных сторон. Вывод сделаем справа (слева тоже работает)

        deq.insertLeft(1);
        deq.insertLeft(2);
        deq.insertLeft(3);
        deq.insertRight(5);
        deq.insertRight(4);

        while (!deq.isEmpty()) {
            System.out.println(deq.removeLeft());
        }
    }

    // в следующем методе перед добавлением проверяем очередь на заполненность.
    private static void addToQueue(Queue qu, int value) {
        if (!qu.isFull()) {
            qu.insert( value );

        }
    }
}
