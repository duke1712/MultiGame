package com.example.cyberpaths.multigame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void newGame(View view) {
        constants.p1=0;
        constants.p2=0;
        Intent newIntent = new Intent(this,newGame.class);
        startActivity(newIntent);
    }
}
