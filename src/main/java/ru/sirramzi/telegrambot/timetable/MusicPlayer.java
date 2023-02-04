package ru.sirramzi.telegrambot.timetable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();
    private Music music;
    ClassicalMusic classicalMusic;
    PopMusic popMusic;
    RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, PopMusic popMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.popMusic = popMusic;
        this.rockMusic = rockMusic;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }

}