package com.example;

import com.example.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args){
        Person goofy = new Person("goofy", "disney", "12345678A", 1985, "USA", 'H');
        Person miniie = new Person("miniie", "disney", "78945612A", 1984, "USA", 'M');
        goofy.print();
        miniie.print();
    }
}   
        