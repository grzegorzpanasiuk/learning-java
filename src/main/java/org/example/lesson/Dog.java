package org.example.lesson;

public class Dog {
    private int age;
    private String colour;

    public Dog(String colour, int age) {
        this.colour = colour;
        this.age = age;
    }

    public void giveVoice() {
        System.out.println("Woof woof");
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
