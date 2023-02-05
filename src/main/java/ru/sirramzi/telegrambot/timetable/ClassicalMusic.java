package ru.sirramzi.telegrambot.timetable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    List<String> musicList = new ArrayList<>();

    public ClassicalMusic() {
        musicList.add("Classical Music #1");
        musicList.add("Classical Music #2");
        musicList.add("Classical Music #3");
    }

    public List<String> getSong() {
        return musicList;
    }

}
