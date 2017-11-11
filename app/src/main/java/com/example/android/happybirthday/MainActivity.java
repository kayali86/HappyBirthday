package com.example.android.happybirthday;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView    JtxtVHappy, JtxtVFrom;
    Typeface ty1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Type Face
        ty1 = Typeface.createFromAsset(getAssets(),"font/berkshireSwash-Regular.ttf");
        //Text View
        JtxtVHappy = (TextView) findViewById(R.id.txtVHappy);
        JtxtVFrom = (TextView) findViewById(R.id.txtVFrom);
        ////
        JtxtVHappy.setTypeface(ty1);
        JtxtVFrom.setTypeface(ty1);

    }
}
