
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
 * represent a normal tweet
 * @author  teamx
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */

public class NormalTweet extends Tweet {
    /**
     * constructs a normal tweet
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * constructs a normal tweet
     * @param message
     * @param date
     */

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
