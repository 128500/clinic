package com.llisovichok.lessons.clinic;

/**
 * This class throws exceptions
 * Created by ALEKSANDER KUDIN on 21.01.2017.
 */
public class UserException extends Exception{
    public UserException(final String message){
        new ClinicMessageWindow(message,2);
    }
}
