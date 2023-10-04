/*
 * Hayden Holbrook
 * CSCI-333 Fall 2023
 * Homework 5 - Hash Tables
 */
package edu.unca.csci333;

import java.util.Random;

class Main {
    public static void main(String[] args) {
        // TODO: Implement main()

        Random rand = new Random();
        ChainedHashTable<Integer> h = new ChainedHashTable<>(10);

        for (int i = 0; i < 10; i++) {
            h.insert(rand.nextInt());
        }

        System.out.println(h.toString());
    }
}