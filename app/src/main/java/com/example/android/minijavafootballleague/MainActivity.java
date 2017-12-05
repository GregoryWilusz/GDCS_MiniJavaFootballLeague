package com.example.android.minijavafootballleague;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.minijavafootballleague.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int gamesPlayedA = 0;
    int scoreTeamB = 0;
    int gamesPlayedB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of games played for Team A.
     */
    public void displayGamesTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_game);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points for a win of Team A.
     */
    public void addWinTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
        gamesPlayedA += 1;
        displayGamesTeamA(gamesPlayedA);

    }

    /**
     * Add 1 point for a drawn of Team A.
     */
    public void addDrawnTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
        gamesPlayedA += 1;
        displayGamesTeamA(gamesPlayedA);

    }

    /**
     * Add no points for a lost of Team A.
     */
    public void lostTeamA(View view) {
        scoreTeamA += 0;
        displayForTeamA(scoreTeamA);
        gamesPlayedA += 1;
        displayGamesTeamA(gamesPlayedA);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of games played for Team B.
     */
    public void displayGamesTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_game);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points for a win of Team B.
     */
    public void addWinTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
        gamesPlayedB += 1;
        displayGamesTeamB(gamesPlayedB);
    }

    /**
     * Add 1 point for a drawn of Team B.
     */
    public void addDrawnTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
        gamesPlayedB += 1;
        displayGamesTeamB(gamesPlayedB);
    }

    /**
     * Add no points for a lost of Team B.
     */
    public void lostTeamB(View view) {
        scoreTeamB += 0;
        displayForTeamB(scoreTeamB);
        gamesPlayedB += 1;
        displayGamesTeamB(gamesPlayedB);
    }

    /**
     * Sets score and number of games to 0 for both teams.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        gamesPlayedA = 0;
        displayForTeamA(scoreTeamA);
        displayGamesTeamA(gamesPlayedA);
        scoreTeamB = 0;
        gamesPlayedB = 0;
        displayForTeamB(scoreTeamB);
        displayGamesTeamB(gamesPlayedB);
    }
}
