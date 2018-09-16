package com.valiksk8;

public class ArrayList<T> {

    private Object[] array;
    private static final int INITIAL_LENGTH = 16;
    private static final double LOAD_FACTOR = 1.25;
    private int currentLenth;
    private int size;


    public ArrayList() {
        this.array = new Object[INITIAL_LENGTH];
        currentLenth = INITIAL_LENGTH;
    }

    public void add(T element) {
        if (size * LOAD_FACTOR >= currentLenth) {
            increaseLength();
        }
        array[size] = element;
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, size);
        size--;
        if (size * LOAD_FACTOR <= currentLenth) {
            decreaseLength();
        }
    }

    private void increaseLength() {
        currentLenth *= LOAD_FACTOR;
        Object[] newArray = new Object[currentLenth];

        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private void decreaseLength() {
        currentLenth /= LOAD_FACTOR;
        Object[] newArray = new Object[currentLenth];

        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
