package ru.geekbrains.MyPractice;

public class StackImpl implements Stack {


    private char[] data;
    private int currentSize;

    public StackImpl(int maxSize) {
        this.currentSize = 0;
        this.data = new char[maxSize];
    }

    @Override
    public char pop() {
        try {
            return this.data[--currentSize];
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Нельзя вызывать pop() для пустого стека!", e);
        }
    }

    @Override
    public void push(char value) {
        try {
            this.data[currentSize++] = value;
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Нельзя вызывать push() для заполненного стека!", e);
        }
    }

    @Override
    public char peek() {
        return this.data[currentSize - 1];
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean isFull() {
        return currentSize >= data.length;
    }
}
