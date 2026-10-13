package org.example;

import org.example.lesson.Bird;
import org.example.lesson.Dog;
import org.example.lesson.Cat;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("White", 5);
        cat.setColour("Black");
        // cat.giveVoice();

        Dog dog = new Dog("Brown", 1);
        // dog.giveVoice();

        Bird bird = new Bird("Green", 2, true);
        // bird.giveVoice();

        ArrayList<Object> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);
        pets.add(bird);

        for (Object pet: pets) {
            if (pet instanceof Cat) {
                ((Cat) pet).giveVoice();
            } else if (pet instanceof Dog) {
                ((Dog) pet).giveVoice();
            } else if (pet instanceof Bird) {
                ((Bird) pet).giveVoice();
            }
        }

    }
}