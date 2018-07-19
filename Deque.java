package ru.geekbrains.MyPractice;

public class Deque extends QueueImpl {
    public static final int DEFAULT_REAR = -1;
    public static final int DEFAULT_FRONT = 0;


    private int[] data;
    private int currentSize;

    private int front_L;
    private int rear_L;
    private int front_R;
    private int rear_R;


    public Deque(int maxSize) {

        super(maxSize);
        this.currentSize = 0;
        this.front_L = DEFAULT_FRONT;
        this.rear_L = DEFAULT_REAR;
        this.front_R = DEFAULT_FRONT + maxSize - 1;
        this.rear_R = DEFAULT_REAR + maxSize;
        this.data = new int[maxSize];
    }



    public void insertLeft(int value) {
        if (rear_L == data.length - 1) {
            rear_L = DEFAULT_REAR;
        }
        data[++rear_L] = value;
        currentSize++;
    }


    public int removeLeft() {
        int removedValue = data[front_L++];
        if (front_L == data.length) {
            front_L = DEFAULT_FRONT;
        }
        currentSize--;
        return removedValue;
    }


    public void insertRight(int value) {

        if (rear_R == -1) {
            rear_R = DEFAULT_REAR + data.length;
        }
        data[rear_R--] = value;
        currentSize++;
    }


    public int removeRight() {

        int removedValue = data[front_R--];
        if (front_R == -1) {
            front_R = DEFAULT_FRONT + data.length - 1;
        }
        currentSize--;
        return removedValue;
    }

//    @Override
//    public void insert(int value) {
//        if (rear_L == data.length - 1) {
//            rear_L = DEFAULT_REAR;
//        }
//        data[++rear_L] = value;
//        currentSize++;
//    }
//
//    @Override
//    public int remove() {
//        int removedValue = data[front_L++];
//        if (front_L == data.length) {
//            front_L = DEFAULT_FRONT;
//        }
//        currentSize--;
//        return removedValue;
//    }

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
        return currentSize == data.length;
    }
}


