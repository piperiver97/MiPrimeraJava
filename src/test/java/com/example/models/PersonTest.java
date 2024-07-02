package com.example.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testGetBornDate() {
        Person piperico = new Person("felipe", "rico", "12366a52", 1997, "COL", 'H');
         assertEquals(1997, piperico.getBornDate());
    }

    @Test
    void testGetCountry() {
        Person piperico = new Person("felipe", "rico", "12366a52", 1997, "COL", 'H');
        assertEquals("COL", piperico.getCountry());

    }

    @Test
    void testGetDni() {
        Person piperico = new Person("felipe", "rico", "12366a52", 1997, "COL", 'H');
        assertEquals("12366a52", piperico.getDni());

    }

    @Test
    void testGetGender() {
        Person piperico = new Person("felipe", "rico", "12366a52", 1997, "COL", 'H');
        assertEquals('H', piperico.getGender());
    }

    @Test
    void testGetLastname() {
        Person piperico = new Person("felipe", "rico", "12366a52", 1997, "COL", 'H');
        assertEquals("rico", piperico.getLastname());
    }

    @Test
    void testGetName() {
        Person piperico = new Person("felipe", "rico", "12366a52", 1997, "COL", 'H');
        assertEquals("felipe", piperico.getName());
    }
}
