package ru.sirramzi.telegrambot.timetable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    List<String> musicList = new ArrayList<>();

    public RockMusic() {
        musicList.add("Rock Music #1");
        musicList.add("Rock Music #2");
        musicList.add("Rock Music #3");
    }

    public  List<String> getSong() {
        return musicList;
    }
    
}
