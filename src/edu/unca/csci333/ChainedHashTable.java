/*
 * Hayden Holbrook
 * CSCI-333 Fall 2023
 * Homework 5 - Hash Tables
 */
package edu.unca.csci333;

import java.util.LinkedList;

public class ChainedHashTable<T> {
    private final double a = 0.6180339887; // approx. the fractional part of the golden ratio
   private LinkedList<T>[] table;

   public ChainedHashTable(int num_elements) {
       this.table = new LinkedList[nextPowerOfTwo(num_elements)];
       for (int i = 0; i < table.length; i++) {
           table[i] = new LinkedList<>();
       }
   }

   public void insert(T item) {
       int hash = hash(item.hashCode());
       this.table[hash].add(item);
   }

   public void delete(T item) {
       int hash = hash(item.hashCode());
       this.table[hash].remove(item);
   }

   public T search(T item) {
       int hash = hash(item.hashCode());
       int index = this.table[hash].indexOf(item);
       if (index >= 0)
           return this.table[hash].get(index);
       else
           return null;
   }

   private int hash(int n) {
       return (int) Math.abs(Math.floor(this.table.length * ((n * a) % 1))) % this.table.length;
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

   @Override
    public String toString() {
       String s = "ChainedHashTable:\nIndex\tElement\n";
       for (int i = 0; i < this.table.length; i++) {
           s += i + "\t";
           for (int j = 0; j < this.table[i].size(); j++) {
               s += this.table[i].get(j) + " -> ";
           }
           s += "\n";
       }
      return s;
   }
}
