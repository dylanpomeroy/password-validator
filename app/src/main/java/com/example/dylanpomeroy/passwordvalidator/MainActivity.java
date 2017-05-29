package com.example.dylanpomeroy.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkPassword(View view){
        Password password = new Password(
                ((EditText)findViewById(R.id.txtPassEntry))
                        .getText().toString());

        if (password.validate()){
            ((TextView)findViewById(R.id.lblPassStrength))
                    .setText(R.string.strongPassMsg);
        }
        else {
            ((TextView)findViewById(R.id.lblPassStrength))
                    .setText(R.string.weakPassMsg);
        }
    }
}
