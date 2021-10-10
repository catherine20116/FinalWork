package ru.yekku.myMusicPlayer;

import org.springframework.beans.factory.annotation.Value;

public class Computer {
    public Player player;

    @Value("${computer.volume}")
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Computer(String type) {
        if(type.equals("rock")) {
            this.player = new PlayerRock();
        } else {
            this.player = new PlayerClassical();
        }
    }

    public String play() {
        return this.player.playMusic() + ". Current volume: " + getVolume();
    }
}
