package ru.sirramzi.telegrambot.timetable;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        int songNumber = new SplittableRandom().nextInt(musicList.size());
        System.out.println("Playing: " + musicList.get(songNumber).getSong());
        return musicList.get(songNumber).getSong();
    }

}