package ru.geekbrains.MyPractice;

import java.util.Iterator;

public class LinkedListIterator implements Iterator <Integer> {


   private LinkedList list;
   private boolean firstIteratу = true;
   private Item current;
   private Item previos;



    public LinkedListIterator(LinkedList list) {
        this.list = list;
        this.reset();
           }

    @Override
    public boolean hasNext() {
        if (firstIteratу) {
            firstIteratу = false;
            return list.getFirstElement() != null;
        }
        else {
            return current.getNextItem() != null;
        }
    }

    @Override
    public Integer next() {
        if ( current == null ) {
            current = list.getFirstItem();
        }
        else {
            current = current.getNextItem();
        }


        return current.getValue();
    }

    @Override
    public void remove() {
        list.remove(current.getValue());

    }

    // добавим методы из методички

    public void reset () {  // перемещение в начало списка
        current = list.getFirstItem();
        previos = null;
    }

    public Item getCurrent () { //получение элемента на который указывает итератор
        return current;
    }



}
