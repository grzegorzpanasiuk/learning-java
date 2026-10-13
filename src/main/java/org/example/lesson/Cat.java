package org.example.lesson;

public class Cat extends Animal {
    public Cat(String colour, int age) {
        super(age, colour);
    }

    @Override
    public void giveVoice() {
        System.out.println("Meow meow");
    }
}

