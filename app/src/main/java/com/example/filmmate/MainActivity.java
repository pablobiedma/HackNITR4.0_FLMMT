package com.example.filmmate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private CardView Signup;
    private TextView Login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Signup = (CardView) findViewById(R.id.cardView);
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignup();
            }
        });
        Login = (TextView)findViewById(R.id.textView2);
        Login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
    }


    public void openLogin(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }


    public void openSignup(){
        Intent intent = new Intent(this, Signup.class);
        startActivity(intent);
    }
}

