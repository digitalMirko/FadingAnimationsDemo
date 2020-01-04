package com.digitalmirko.fadinganimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        Log.i("Info","Imageview has been tapped");

        // Bart imageview
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        // fade out, 0 will fade out completely, over 2 seconds which is 2000 miliseconds
        bartImageView.animate().alpha(0).setDuration(2000);

        // Homer imageview
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        // fade in, 1 will fade in completely, over 2 seconds which is 2000 miliseconds
        homerImageView.animate().alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
