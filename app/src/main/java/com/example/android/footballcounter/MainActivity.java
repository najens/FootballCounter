package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    /**
     * The global variables are defined here.
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int timeoutsTeamA = 3;
    int timeoutsTeamB = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when Team A TOUCHDOWN button is clicked.
     */
    public void addSevenForTeamA(View v) {
        scoreTeamA = scoreTeamA + 7;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * This method is called when Team A EXTRA POINT button is clicked.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * This method is called when Team A FIELD GOAL button is clicked.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * This method is called when Team A SAFETY button is clicked.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * This method is called when Team B TOUCHDOWN button is clicked.
     */
    public void addSevenForTeamB(View v) {
        scoreTeamB = scoreTeamB + 7;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * This method is called when Team B EXTRA POINT button is clicked.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * This method is called when Team B FIELD GOAL button is clicked.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * This method is called when Team B SAFETY button is clicked.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * This method is called when Team A TO button is clicked.
     */
    public void removeOneTeamA(View v) {
        if (timeoutsTeamA != 0) {
            timeoutsTeamA = timeoutsTeamA - 1;
            displayTeamATimeouts(timeoutsTeamA);
        } else {
            timeoutsTeamA = 0;
            displayTeamATimeouts(timeoutsTeamA);
        }
    }

    /**
     * This method is called when Team B TO button is clicked.
     */
    public void removeOneTeamB(View v) {
        if (timeoutsTeamB != 0) {
            timeoutsTeamB = timeoutsTeamB - 1;
            displayTeamBTimeouts(timeoutsTeamB);
        } else {
            timeoutsTeamB = 0;
            displayTeamBTimeouts(timeoutsTeamB);
        }
    }

    /**
     * This method displays the given Team A Score value on the screen.
     */
    public void displayTeamAScore(int number) {
        TextView scoreATextView = (TextView) findViewById(R.id.teamAScore);
        scoreATextView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * This method displays the given Team B Score value on the screen.
     */
    public void displayTeamBScore(int number) {
        TextView scoreBTextView = (TextView) findViewById(R.id.teamBScore);
        scoreBTextView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * This method displays the given Team A TO value on the screen.
     */
    public void displayTeamATimeouts(int number) {
        TextView timeoutsATextView = (TextView) findViewById(R.id.teamATimeouts);
        timeoutsATextView.setText(String.valueOf(timeoutsTeamA));
    }

    /**
     * This method displays the given Team B TO value on the screen.
     */
    public void displayTeamBTimeouts(int number) {
        TextView timeoutsBTextView = (TextView) findViewById(R.id.teamBTimeouts);
        timeoutsBTextView.setText(String.valueOf(timeoutsTeamB));
    }

    /**
     * This method is called when the RESET button is clicked.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        timeoutsTeamA = 3;
        timeoutsTeamB = 3;
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
        displayTeamATimeouts(timeoutsTeamA);
        displayTeamBTimeouts(timeoutsTeamB);
    }


}
