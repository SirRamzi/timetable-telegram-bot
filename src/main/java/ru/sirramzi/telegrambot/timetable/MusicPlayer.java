package ru.sirramzi.telegrambot.timetable;

public class MusicPlayer {
    Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }
    
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

}