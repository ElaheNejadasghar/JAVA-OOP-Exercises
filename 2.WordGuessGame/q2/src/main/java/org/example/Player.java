package org.example;

public class Player {
    final private String name;
    private int score;
    public Player(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }
}
