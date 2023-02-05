package ru.sirramzi.telegrambot.timetable.genres;

import org.springframework.stereotype.Component;

import ru.sirramzi.telegrambot.timetable.Music;

// @Component
public class ClassicalMusic implements Music {

    public String getSong() {
        return "Classic";
    }

}
