package ru.yekku.myMusicPlayer;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        System.out.println("Choose music type: rock or classical");
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        String typeU = type.toLowerCase();
        sc.close();
        Computer comp = new Computer(typeU);
        //comp.setVolume(50);
        System.out.println(comp.play());

    }

}
