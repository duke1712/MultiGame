package com.example.cyberpaths.multigame;

import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView resultView;
    TextView player1;
    TextView player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent resultIntent = getIntent();
        int result=resultIntent.getIntExtra("result",0);
        resultView=(TextView)findViewById(R.id.result1);
        player1=(TextView)findViewById(R.id.player1score);
        player2=(TextView)findViewById(R.id.player2score);

        if(result==1){
            resultView.setText("Player 1 Wins");
            constants.p1+=1;
        }
        else if(result==2) {
            resultView.setText("Player 2 Wins");
            constants.p2+=1;
        }
        else
            resultView.setText("DRAW!!!!!!");
        player1.setText(constants.p1 + "");
        player2.setText(constants.p2 + "");

    }
    void newGame1(View view)
    {
        constants.p1=0;
        constants.p2=0;
        Intent newIntent = new Intent(this,newGame.class);
        startActivity(newIntent);
    }
    void play(View view)
    {
            Intent newIntent = new Intent(this,newGame.class);
        startActivity(newIntent);
    }
}
