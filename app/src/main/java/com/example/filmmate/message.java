package com.example.filmmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class message extends AppCompatActivity {
    private ImageView face1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        face1 = (ImageView) findViewById(R.id.face1);
        face1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
    }
    public void openProfile(){
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}