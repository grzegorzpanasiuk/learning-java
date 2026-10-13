package org.example.lesson;

public class Bird extends Animal{
    private boolean canDance;

    public Bird(String colour, int age, boolean canDance) {
        super(age, colour);
    }

    @Override
    public void giveVoice() {
        System.out.println("Tweet tweet");
    }

    public boolean canDance() {
        return canDance;
    }
}
