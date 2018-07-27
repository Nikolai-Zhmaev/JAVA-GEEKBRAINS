package ru.geekbrains.MyPractice;

import java.util.Iterator;

public class LinkedListImpl implements LinkedList {

    protected Item firstElement;
    protected int size; // переменная для подсчета количества элементов в списке

    public LinkedListImpl() {
        this.size = 0;

    }


    @Override
    public int removeFirst() {

        if ( firstElement == null ){
            throw new IllegalCallerException("Список пуст!!!");
        }
        int value = firstElement.getValue();
        Item nextItem = firstElement.getNextItem();
        firstElement.setNextItem(null);
        firstElement = nextItem;
        size--;

        return value;
    }

    @Override
    public void insertFirst(int value) {
        Item newElement = new Item(value); // создаем новый объект
        if ( isEmpty() ) {
            firstElement = newElement; // вариант когда список пустой
        }
        else {
            newElement.setNextItem(firstElement); // вариант когда список не пустой
            firstElement = newElement;
        }
        size++;
    }

    @Override
    public Integer getFirstElement() {
        return firstElement != null ? firstElement.getValue() : null; // здесь обрабатываем условие пустого списка

    }

    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public int detSize() {
        return size;
    }

    @Override
    public void display() {
        Item currentElement = firstElement;
        while ( currentElement!=null ) {
            System.out.println(currentElement);
            currentElement = currentElement.getNextItem();
        }
    }

    @Override
    public boolean find(int value) {
        Item currentItem = firstElement;
        while ( currentItem != null ) {
            if ( currentItem.getValue() == value ) {
                return  true;
            }
            currentItem = currentItem.getNextItem();
        }
        return false;
    }

    @Override
    public boolean remove(int value) {
        Item currentItem = firstElement;
        Item priviousItem = null;
        while ( currentItem != null ) {
            if ( currentItem.getValue() == value ) {
                break;
            }
            priviousItem = currentItem;
            currentItem = currentItem.getNextItem();
        }
        if ( currentItem == null ) {
            return false;
        }
        if ( currentItem == firstElement ) { // обрабатываем вариант когда удаляемый элемент первый
            firstElement = currentItem.getNextItem();
        }
        else {
            Item nextItem = currentItem.getNextItem();
            priviousItem.setNextItem(nextItem);

        }
        return true;


    }

    @Override
    public Item getFirstItem() {
        return firstElement;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new LinkedListIterator(this);
    }
}
