package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by yi16 on 9/14/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    protected ArrayList<Mood> moods = new ArrayList<Mood>();
    //since we can directly add mood in moods list, therefore i did not add method to add a mood

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }
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
    public String getMessage(){
        return message;
    }
    public abstract Boolean isImportant();
}
