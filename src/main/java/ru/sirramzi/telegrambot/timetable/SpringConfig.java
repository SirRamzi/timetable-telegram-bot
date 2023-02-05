package ru.sirramzi.telegrambot.timetable;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.sirramzi.telegrambot.timetable")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public Music classicalMusic() {
        return new ClassicalMusic();
    }
    
    @Bean
    public Music popMusic() {
        return new PopMusic();
    }

    @Bean
    public Music rockMusic() {
        return new RockMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), popMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
