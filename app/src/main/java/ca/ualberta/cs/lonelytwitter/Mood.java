/*
 * Copyright©2017 teamx, CMPUT301, University of Alberta-All Right Reserved.
 * You may use, distribute, or modify this code under term and conditions o fthe Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact yi16@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yi16 on 9/14/17.
 */

/**
 * @author teamx
 * @see Mood_happy
 * @see Mood_sad
 */
public abstract class Mood {
    //private String mood;
    private Date date;

    /**
     * construct a mood
     */
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
