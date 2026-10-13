package org.example.lesson;

public class Cat {
    private int age;
    private String colour;

    public Cat(String colour, int age) {
        this.colour = colour;
        this.age = age;
    }

    public void giveVoice() {
        System.out.println("Meow meow");
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
