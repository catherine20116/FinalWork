package ru.yekku.myMusicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlayerClassical implements Player {
    private Music music;

    @Autowired
    public PlayerClassical() {
            this.music = new ClassicalMusic();
    }

    public String playMusic() {
        return "Playing: " + music.getSong();
    }
}
