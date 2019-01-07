package com.abhishekvenunathan.otheranimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView cat = findViewById(R.id.catView);
        cat.animate().alpha(1).setDuration(2000).rotation(720f).setDuration(2000);


    }
}
