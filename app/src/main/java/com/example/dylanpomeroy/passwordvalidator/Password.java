package com.example.dylanpomeroy.passwordvalidator;

/**
 * Created by dylanpomeroy on 5/28/17.
 */

public class Password {
    public String text;

    public Password(String text){
        this.text = text;
    }

    public boolean validate(){
        if (this.text == "password"
                || this.text.length() < 8){
            return false;
        }

        return true;
    }
}
