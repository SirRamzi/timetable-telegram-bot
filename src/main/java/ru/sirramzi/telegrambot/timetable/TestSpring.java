package ru.sirramzi.telegrambot.timetable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = context.getBean("computer", Computer.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicGenry.CLASSICAL);
        context.close();
    }
}
