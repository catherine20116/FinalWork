package ru.yekku.myMusicPlayer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.yekku.myMusicPlayer")
@PropertySource("classpath:musicPlayer.properties")
public class PlayerConfig {
}
