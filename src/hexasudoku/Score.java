/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexasudoku;

/**
 *
 * @author elise
 */

import java.io.Serializable;


public class Score implements Serializable {
    
    public String name;
    public String difficulty;
    public int time;
    public int score;
    
    public Score(String name, String difficulty, int time,int score){
        this.name=name;
        this.difficulty=difficulty;
        this.time=time;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getTime() {
        return time;
    }
    
    public int getScore(){
        return score;
    }
    
    
    
}
