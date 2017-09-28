/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27,2017
 *
 * Copyright©2017 teamx, CMPUT301, University of Alberta-All Right Reserved.
 * You may use, distribute, or modify this code under term and conditions o fthe Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact yi16@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by yi16 on 9/14/17.
 */

/**
 * Represents a tweet
 *
 * @author teamx
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{
    /*
    *
     */
    private String message;
    private Date date;
    protected ArrayList<Mood> moods = new ArrayList<Mood>();
    //since we can directly add mood in moods list, therefore i did not add method to add a mood

    /**
     * Constructs a tweet object
     *
     * @param message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    /**
     * sets the tweet message.
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length()<=140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }
    public Date getDate(){
        return date;
    }

    /**
     * get tweet message
     * @return tweet message
     */
    public String getMessage(){
        return message;
    }
    public abstract Boolean isImportant();

    /**
     *
     * @return date with message
     */
    @Override
    public String toString(){
        return date.toString() + "|" + message;
    }

}
