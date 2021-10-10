package ru.yekku.myMusicPlayer;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ClassicalMusic implements Music{
    private Map<String, String> playlistClassic;

    public ClassicalMusic() {
        this.playlistClassic = new TreeMap<>();
        this.playlistClassic.put("Mozart", "Eine kleine Nachtmusik");
        this.playlistClassic.put("Beethoven", "Fur Elise");
        this.playlistClassic.put("Bach", "Toccata and Fugue in D minor");
    }

    @Override
    public String getSong() {
        Random rand = new Random();
        int index = rand.nextInt(3);
        List<String> keyList = new ArrayList<>(playlistClassic.keySet());
        List<String> keyValues = new ArrayList<>(playlistClassic.values());
        return keyValues.get(index) + ". Author: " + keyList.get(index);
    }
}
