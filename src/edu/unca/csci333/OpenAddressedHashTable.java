package edu.unca.csci333;

import java.util.ArrayList;

public class OpenAddressedHashTable<T> {
    private T[] table;

    public OpenAddressedHashTable(int num_elements) {
        this.table = (T[]) new Object[nextPowerOfTwo(num_elements)];
    }

    public void insert(T item) {
        // TODO: Implement insert()
    }

    public void delete(T item) {
        // TODO: Implement delete()
    }

    public T search(T item) {
        // TODO: Implement search()
        return null;
    }

    private int nextPowerOfTwo(int n) {
        n--;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        n |= n >> 16;
        n++;
        return n;
    }

    private int hash(int n) {
        // TODO: Implement hash()
        return 0;
    }

    private int hash(int n, int index) {
        // TODO: Implement hash()
        return 0;
    }

    @Override
    public String toString() {
        // TODO: Implement toString()
        return "IMPLEMENT ME";
    }
}
