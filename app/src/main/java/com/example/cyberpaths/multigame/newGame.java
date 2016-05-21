package com.example.cyberpaths.multigame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class newGame extends AppCompatActivity {
    int turn=0;
    int cells[][]=new int[3][3];
     Button one;
     Button two;
     Button three;
     Button four;
     Button five;
     Button six;
     Button seven;
     Button eight;
     Button nine;
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);


        initialise();

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        message=(TextView)findViewById(R.id.message);
        one.setText("-");
        two.setText("-");
        three.setText("-");
        four.setText("-");
        five.setText("-");
        six.setText("-");
        seven.setText("-");
        eight.setText("-");
        nine.setText("-");
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        turn=0;




        // onclick listner for the buttons


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn % 2 == 0) {
                    one.setText("X");
                    cells[0][0] = 1;
                    valid(turn);
                    //message.setText("Player 2's Turn");
                } else {
                    one.setText("O");
                    cells[0][0] = 2;
                    valid(turn);
                    //  message.setText("Player 1's Turn");
                }
                turn++;
                if(turn==9)
                    message.setText("DRAW!!!!!");
                one.setEnabled(false);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn % 2 == 0) {
                    two.setText("X");
                    cells[0][1]=1;
                    valid(turn);
                    // message.setText("Player 2's Turn");
                }
                else {
                    two.setText("O");
                    cells[0][1] = 2;
                    valid(turn);
                    //message.setText("Player 2's Turn");
                }
                turn++;
                if(turn==9)
                    message.setText("DRAW!!!!!");
                two.setEnabled(false);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn % 2 == 0) {
                    three.setText("X");
                    cells[0][2]=1;
                    valid(turn);
                    //message.setText("Player 2's Turn");
                }
                else {
                    three.setText("O");
                    ///message.setText("Player 1's Turn");
                    cells[0][2] = 2;
                    valid(turn);
                }
                turn++;
                if(turn==9)
                    message.setText("DRAW!!!!!");
                three.setEnabled(false);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (turn % 2 == 0) {
                    four.setText("X");
                    cells[1][0] = 1;
                    valid(turn);
                    //message.setText("Player 2's Turn");
                } else {
                    four.setText("O");
                    cells[1][0] = 2;
                    valid(turn);
                    //message.setText("Player 1's Turn");
                }
                turn++;
                if(turn==9)
                    message.setText("DRAW!!!!!");
                four.setEnabled(false);

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (turn % 2 == 0) {
                    five.setText("X");
                    cells[1][1] = 1;valid(turn);
                    //message.setText("Player 2's Turn");
                } else {
                    five.setText("O");
                    cells[1][1] = 2;

                    valid(turn);
                    //message.setText("Player 1's Turn");
                }
                turn++;
                if(turn==9)
                    message.setText("DRAW!!!!!");
                five.setEnabled(false);

            }
        });
        six.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (turn % 2 == 0) {
                    six.setText("X");
                    cells[1][2]=1;valid(turn);
                    //  message.setText("Player 2's Turn");
                }
                else {
                    six.setText("O");
                    cells[1][2] = 2;valid(turn);
                    //   message.setText("Player 1's Turn");
                }
                turn++;
                if(turn==9)
                    message.setText("DRAW!!!!!");
                six.setEnabled(false);

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn % 2 == 0) {
                    seven.setText("X");
                    cells[2][0] = 1;valid(turn);
                    //  message.setText("Player 2's Turn");
                }
                else {
                    seven.setText("O");
                    cells[2][0] = 2;valid(turn);
                    //    message.setText("Player 1's Turn");
                }
                seven.setEnabled(false);
                turn++;
                if(turn==9)
                    message.setText("DRAW!!!!!");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn % 2 == 0) {
                    eight.setText("X");
                    cells[2][1] = 1;valid(turn);
                    //   message.setText("Player 2's Turn");
                }
                else {
                    eight.setText("O");
                    cells[2][1] = 2;valid(turn);
                    //message.setText("Player 1's Turn");
                }
                turn++;
                if(turn==9)
                    message.setText("DRAW!!!!!");
                eight.setEnabled(false);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn % 2 == 0) {
                    nine.setText("X");
                    cells[2][2] = 1;valid(turn);
                    //    message.setText("Player 2's Turn");
                }
                else{
                    nine.setText("O");
                    cells[2][2] = 2;valid(turn);
                    //message.setText("Player 1's Turn");
                }
                turn++;
                if(turn==9)
                    message.setText("DRAW!!!!!");
                nine.setEnabled(false);
            }
        });

    }

    public void valid(int t)
    {
        int x=validate();
        final TextView message = (TextView)findViewById(R.id.message);

        if(x==1)
        {
            //  final TextView message = (TextView)findViewById(R.id.message);
            message.setText("Player 1 Wins.\n" +
                    " Click New Game");
            one = (Button) findViewById(R.id.one);
            two = (Button) findViewById(R.id.two);
            three = (Button) findViewById(R.id.three);
            four = (Button) findViewById(R.id.four);
            five = (Button) findViewById(R.id.five);
            six = (Button) findViewById(R.id.six);
            seven = (Button) findViewById(R.id.seven);
            eight = (Button) findViewById(R.id.eight);
            nine = (Button) findViewById(R.id.nine);
            one.setEnabled(false);
            two.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            five.setEnabled(false);
            six.setEnabled(false);
            seven.setEnabled(false);
            eight.setEnabled(false);
            nine.setEnabled(false);
            turn = 0;
        }
        else if(x==2)
        {
            //  final TextView message = (TextView)findViewById(R.id.message);
            message.setText("Player 2 Wins\n Click New Game");
            one = (Button) findViewById(R.id.one);
            two = (Button) findViewById(R.id.two);
            three = (Button) findViewById(R.id.three);
            four = (Button) findViewById(R.id.four);
            five = (Button) findViewById(R.id.five);
            six = (Button) findViewById(R.id.six);
            seven = (Button) findViewById(R.id.seven);
            eight = (Button) findViewById(R.id.eight);
            nine = (Button) findViewById(R.id.nine);
            one.setEnabled(false);
            two.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            five.setEnabled(false);
            six.setEnabled(false);
            seven.setEnabled(false);
            eight.setEnabled(false);
            nine.setEnabled(false);
            turn = 0;

        }
        else
        {
            // final TextView message = (TextView)findViewById(R.id.message);

            if (t % 2 == 0)
                message.setText("Player 2's Turn");
            else
                message.setText("Player 1's Turn");

        }
    }
    public int validate(){
        //validation for right diagnol
        if(cells[0][0]==1&&cells[1][1]==1&&cells[2][2]==1)
            return 1;
        if(cells[0][0]==2&&cells[1][1]==2&&cells[2][2]==2)
            return 2;
        //validation for left diagnol
        if(cells[0][2]==1&&cells[1][1]==1&&cells[2][0]==1)
            return 1;
        if(cells[0][2]==2&&cells[1][1]==2&&cells[2][0]==2)
            return 2;
        //validation for 1st row
        if(cells[0][0]==1&&cells[0][1]==1&&cells[0][2]==1)
            return 1;
        if(cells[0][0]==2&&cells[0][1]==2&&cells[0][2]==2)
            return 2;
        //validation for 2nd row
        if(cells[1][0]==1&&cells[1][1]==1&&cells[1][2]==1)
            return 1;
        if(cells[1][0]==2&&cells[1][1]==2&&cells[1][2]==2)
            return 2;
        //validation for 3rd row
        if(cells[2][0]==1&&cells[2][1]==1&&cells[2][2]==1)
            return 1;
        if(cells[2][0]==2&&cells[2][1]==2&&cells[2][2]==2)
            return 2;
        //1st column
        if(cells[0][1]==1&&cells[1][1]==1&&cells[2][1]==1)
            return 1;
        if(cells[0][1]==2&&cells[1][1]==2&&cells[2][1]==2)
            return 2;
        //2nd column
        if(cells[0][2]==1&&cells[1][2]==1&&cells[2][2]==1)
            return 1;
        if(cells[0][2]==2&&cells[1][2]==2&&cells[2][2]==2)
            return 2;
        //
        if(cells[0][0]==1&&cells[1][0]==1&&cells[2][0]==1)
            return 1;
        if(cells[0][0]==2&&cells[1][0]==2&&cells[2][0]==2)
            return 2;


        return 0;


    }
    public void initialise()
    {
        for (int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                cells[i][j]=0;


    }
}
