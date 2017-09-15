package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yi16 on 9/14/17.
 */

public abstract class Mood {
    //private String mood;
    private Date date;
    public Mood(){
        this.date = new Date();
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public abstract String getMood();
}
