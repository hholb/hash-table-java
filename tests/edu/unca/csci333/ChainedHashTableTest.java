package edu.unca.csci333;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainedHashTableTest {

    @Test
    void insert() {
        ChainedHashTable h = new ChainedHashTable<>(10);
        String s = "Hello";
        h.insert(s);
        assert(h.search(s) == s);
    }

    @Test
    void delete() {
        ChainedHashTable h = new ChainedHashTable<>(10);
        String s = "Hello";
        h.insert(s);
        assert h.search(s) == s;
        h.delete(s);
        assert h.search(s) == null;
    }

    @Test
    void search() {
        insert();
        delete();
    }
}