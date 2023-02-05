package ru.sirramzi.telegrambot.timetable;

import java.util.List;
import java.util.SplittableRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;
    private Music popMusic;
    private Music currentMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic,
            @Qualifier("popMusic") Music popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public String playMusic(MusicGenry genry) {
        switch (genry) {
            case CLASSICAL:
                currentMusic = classicalMusic;
                break;
            case ROCK:
                currentMusic = rockMusic;
                break;
            case POP:
                currentMusic = popMusic;
                break;
            default:
                break;
        }
        System.out.println(currentMusic.getSong().get(new SplittableRandom().nextInt(3)));
        return currentMusic.getSong().get(new SplittableRandom().nextInt(3));
    }

}