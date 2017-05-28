package com.example.dylanpomeroy.passwordvalidator;

/**
 * Created by dylanpomeroy on 5/28/17.
 */

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Password {
    public String text;

    public Password(String text){
        this.text = text;
    }

    public boolean validate(){

        ArrayList<Pattern> patterns = new ArrayList<Pattern>();
        patterns.add(Pattern.compile(".{8,}"));
        patterns.add(Pattern.compile(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"));
        patterns.add(Pattern.compile(".*[A-Z].*"));
        patterns.add(Pattern.compile(".*[a-z].*"));
        patterns.add(Pattern.compile(".*[0-9].*"));

        for (Pattern pattern : patterns)
            if (!pattern.matcher(this.text).matches())
                return false;
        return true;
    }
}
