package com.example.android.happybirthday;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView    happy_birthday, from_me;
    Typeface ty1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaring a Type Face
        ty1 = Typeface.createFromAsset(getAssets(),"font/berkshireSwash-Regular.ttf");

        //TextViews initialization
        happy_birthday = (TextView) findViewById(R.id.txtVHappy);
        from_me = (TextView) findViewById(R.id.txtVFrom);

        //Setting Typeface to TextViews
        happy_birthday.setTypeface(ty1);
        from_me.setTypeface(ty1);

    }
}
