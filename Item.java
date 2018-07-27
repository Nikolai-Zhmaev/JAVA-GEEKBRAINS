package ru.geekbrains.MyPractice;

// класс объекта

import java.util.Objects;

public class Item {

    private final int value; // поле для хранения значения (final - так как изменяться не будет);
    private Item nextItem; // поле для зранения ссылки на следующий элемент

    public Item(int value) {

        this.value = value;
    }

// создаем геттеры и сеттеры для допуступа к приватным полям

    public int getValue() {
        return value;
    }

    public void setNextItem(Item nextItem) {

        this.nextItem = nextItem;
    }

    public Item getNextItem() {

        return nextItem;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return value == item.value &&
                Objects.equals(nextItem, item.nextItem);
    }


    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", nextItem=" + nextItem +
                '}';
    }
}
