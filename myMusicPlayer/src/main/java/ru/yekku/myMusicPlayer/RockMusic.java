package ru.yekku.myMusicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RockMusic implements Music{
    private Map<String, String> playlistRock;

    public RockMusic() {
        this.playlistRock = new TreeMap<>();
        this.playlistRock.put("Jimi Hendrix", "Purple Haze");
        this.playlistRock.put("Led Zeppelin", "Whole Lotta Love");
        this.playlistRock.put("The Rolling Stones", "Sympathy for the Devil");
    }

    @Override
    public String getSong() {
        Random rand = new Random();
        int index = rand.nextInt(3);
        List<String> keyList = new ArrayList<>(playlistRock.keySet());
        List<String> keyValues = new ArrayList<>(playlistRock.values());
        return keyValues.get(index) + ". Author: " + keyList.get(index);
    }
}
