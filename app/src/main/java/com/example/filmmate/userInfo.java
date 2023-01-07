package com.example.filmmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class userInfo extends AppCompatActivity {
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        DatePicker simpleDatePicker = (DatePicker)findViewById(R.id.simpleDatePicker); // initiate a date picker
//
//        simpleDatePicker.setSpinnersShown(false); // set false value for the spinner shown function


        //TODO get location by using google play dependancies
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user_info);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserInfo();
            }
        });

    }
    public void openUserInfo () {
        Intent intent = new Intent(this, moreUserInfo.class);
        startActivity(intent);
    }
}