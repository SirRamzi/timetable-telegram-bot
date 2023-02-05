package ru.sirramzi.telegrambot.timetable;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        int songNumber = new SplittableRandom().nextInt(musicList.size());
        return "Playing " + musicList.get(songNumber).getSong() + " with volume " + volume;
    }

}