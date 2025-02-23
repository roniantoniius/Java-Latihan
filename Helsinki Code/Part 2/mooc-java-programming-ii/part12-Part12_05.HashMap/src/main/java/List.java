/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

public class List<T> {

    private T[] array;
    private int firstFreeIndex;

    public List() {
        this.array = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public int size() {
        return this.firstFreeIndex;
    }

    private void increaseSize() {
        this.firstFreeIndex++;
    }

    private void decreaseSize() {
        this.firstFreeIndex--;
    }

    private void grow() {
        int newSize = this.array.length + this.array.length / 2;
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];

        }
        this.array = newArray;
    }

    public void add(T value) {
        if (this.size() == this.array.length) {
            this.grow();
        }
        this.array[this.size()] = value;
        this.increaseSize();
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.size(); i++) {
            if (this.array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }

    private void moveToLeft(int fromIndex) {
        for (int i = fromIndex; i < this.size() - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
    }

    public void remove(T value) {
        int index = indexOfValue(value);
        if (index < 0) {
            return;
        }
        this.moveToLeft(index);
        this.decreaseSize();
    }

    public T value(int index) {
        if (index < 0 || index >= this.size()) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.size() + "]");
        }
        return this.array[index];
    }
}