package org.example;

public class Button {
    private int totalClick = 0;

    public int click(){
        totalClick++;
        System.out.println(totalClick);
        return totalClick;
    }
}
