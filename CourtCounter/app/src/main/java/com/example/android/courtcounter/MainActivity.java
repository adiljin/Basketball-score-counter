package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Group A
     */

    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreeA(View view)
    {
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void plusTwoA(View view)
    {
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void plusOneA(View view)
    {
        scoreA++;
        displayForTeamA(scoreA);
    }

    /*
    Group B
     */

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreeB(View view)
    {
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void plusTwoB(View view)
    {
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void plusOneB(View view)
    {
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void resetAllScores(View view)
    {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}
