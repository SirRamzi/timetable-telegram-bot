package ru.sirramzi.telegrambot.timetable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
    List<String> musicList = new ArrayList<>();

    public PopMusic() {
        musicList.add("Pop Music #1");
        musicList.add("Pop Music #2");
        musicList.add("Pop Music #3");
    }

    public List<String> getSong() {
        return musicList;
    }
    
}
