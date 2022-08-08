package ru.netology.Poster;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void findAll() {
        PosterManager manager = new PosterManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");


        String[] expected = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast5() {
        PosterManager manager = new PosterManager(5);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");

        String[] expected = {"Eleventh", "Tenth", "Ninth", "Eighth", "Seventh", //"Sixth", //"Fifth", //"Fourth", //"Third", //"Second", //"First"
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast11() {
        PosterManager manager = new PosterManager(11);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");

        String[] expected = {"Eleventh", "Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second", "First"
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast0() {
        PosterManager manager = new PosterManager(0);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");

        String[] expected = {};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

}
