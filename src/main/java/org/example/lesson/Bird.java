package org.example.lesson;

public class Bird {
    private int age;
    private String colour;
    private boolean canDance;

    public Bird(String colour, int age, boolean canDance) {
        this.colour = colour;
        this.age = age;
        this.canDance = canDance;
    }

    public void giveVoice() {
        System.out.println("Tweet tweet");
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public boolean canDance() {
        return canDance;
    }
}
