package org.example;

import org.example.lesson.Animal;
import org.example.lesson.Bird;
import org.example.lesson.Dog;
import org.example.lesson.Cat;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("White", 5);
        // cat.giveVoice();

        Dog dog = new Dog(1, "Brown");
        // dog.giveVoice();

        Bird bird = new Bird("Green", 2, true);
        // bird.giveVoice();

        List<Animal> pets = new ArrayList<>(); //pisanie pod interfejs
        pets.add(cat);
        pets.add(dog);
        pets.add(bird);

        for (Animal pet: pets) {
            pet.giveVoice();
        }

    }
}