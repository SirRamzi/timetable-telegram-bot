package ru.sirramzi.telegrambot.timetable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.setVolume(0);
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());
        context.close();
    }
}
