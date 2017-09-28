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
 * @see Tweet
 * @
 */

public class ImportantTweet extends Tweet {
    /**
     * construct an Important Tweet
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * constructs an important tweet
     * @param message
     * @param date
     */

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
