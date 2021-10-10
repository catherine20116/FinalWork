package ru.yekku.myMusicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class PlayerRock implements Player{
    private Music music;

    @Autowired
    public PlayerRock() {
        this.music = new RockMusic();
    }

    public String playMusic() {
        return "Playing: " + music.getSong();
    }
}
