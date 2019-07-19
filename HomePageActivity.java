package com.example.liu.map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomePageActivity extends Activity {
    private ImageButton health, happiness, freedom;
    private ImageView threechoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        health=(ImageButton)findViewById(R.id.health_bt);
        happiness=(ImageButton)findViewById(R.id.happiness_bt);
        freedom=(ImageButton)findViewById(R.id.freedom_bt);
        threechoice=(ImageView)findViewById(R.id.threechoice);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threechoice.setImageResource(R.drawable.health_icon_large3x);
            }
        });
        happiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threechoice.setImageResource(R.drawable.happiness_icon_large3x);
            }
        });
        freedom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threechoice.setImageResource(R.drawable.freedom_icon_large3x);
            }
        });
    }

}
