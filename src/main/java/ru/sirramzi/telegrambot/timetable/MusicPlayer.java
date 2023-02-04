package ru.sirramzi.telegrambot.timetable;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    private void initMethod() {
        System.out.println("Init");
    }

    private void destroyMethod() {
        System.out.println("Destroy");
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }
    }

}