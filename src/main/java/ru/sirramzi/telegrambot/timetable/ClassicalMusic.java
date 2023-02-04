package ru.sirramzi.telegrambot.timetable;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public String getSong() {
        return "Bethowen";
    }

}
