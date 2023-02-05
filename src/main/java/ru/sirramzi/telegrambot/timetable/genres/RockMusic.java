package ru.sirramzi.telegrambot.timetable.genres;

import org.springframework.stereotype.Component;

import ru.sirramzi.telegrambot.timetable.Music;

// @Component
public class RockMusic implements Music {
    
    public String getSong() {
        return "Rock";
    }
    
}
