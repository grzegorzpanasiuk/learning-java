package org.example.lesson;

public class Dog extends Animal {
    public Dog(int age, String colour) {
        super(age, colour);
    }

    @Override
    public void giveVoice() {
        System.out.println("Bark bark");
    }
}
