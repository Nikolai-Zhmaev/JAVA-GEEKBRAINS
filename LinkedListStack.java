package ru.geekbrains.MyPractice;

public class LinkedListStack implements Stack {

  private LinkedList list;


    public LinkedListStack() {
        this.list = new LinkedListImpl();
    }

    @Override
    public void push(int value) {
        list.insertFirst(value);

    }

    @Override
    public int peek() {
        return list.getFirstElement();
    }

    @Override
    public int pop() {
        return list.removeFirst();
    }

    @Override
    public int getSize() {
        return list.detSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
