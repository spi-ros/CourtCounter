package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourtCounter extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int assistTeamA = 0;
    int reboundTeamA = 0;
    int foulTeamA = 0;
    int assistTeamB = 0;
    int reboundTeamB = 0;
    int foulTeamB = 0;
    int point3TotalA = 0;
    int point2TotalA = 0;
    int point1TotalA = 0;
    int point3TotalB = 0;
    int point2TotalB = 0;
    int point1TotalB = 0;
    String scoreTeamA1 = "scoreTeamA";
    String scoreTeamB1 = "scoreTeamB";
    String assistTeamA1 = "assistTeamA";
    String reboundTeamA1 = "reboundTeamA";
    String foulTeamA1 = "foulTeamA";
    String assistTeamB1 = "assistTeamB";
    String reboundTeamB1 = "reboundTeamB";
    String foulTeamB1 = "foulTeamB";
    String point3TotalA1 = "point3TotalA";
    String point2TotalA1 = "point2TotalA";
    String point1TotalA1 = "point1TotalA";
    String point3TotalB1 = "point3TotalB";
    String point2TotalB1 = "point2TotalB";
    String point1TotalB1 = "point1TotalB";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        setContentView(R.layout.activity_court_counter);

        // Save state members for restore instance
        savedInstanceState.putInt(scoreTeamA1, scoreTeamA);
        savedInstanceState.putInt(scoreTeamB1, scoreTeamB);
        savedInstanceState.putInt(assistTeamA1, assistTeamA);
        savedInstanceState.putInt(reboundTeamA1, reboundTeamA);
        savedInstanceState.putInt(foulTeamA1, foulTeamA);
        savedInstanceState.putInt(assistTeamB1, assistTeamB);
        savedInstanceState.putInt(reboundTeamB1, reboundTeamB);
        savedInstanceState.putInt(foulTeamB1, foulTeamB);
        savedInstanceState.putInt(point3TotalA1, point3TotalA);
        savedInstanceState.putInt(point2TotalA1, point2TotalA);
        savedInstanceState.putInt(point1TotalA1, point1TotalA);
        savedInstanceState.putInt(point3TotalB1, point3TotalB);
        savedInstanceState.putInt(point2TotalB1, point2TotalB);
        savedInstanceState.putInt(point1TotalB1, point1TotalB);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        scoreTeamA = savedInstanceState.getInt(scoreTeamA1);
        scoreTeamB = savedInstanceState.getInt(scoreTeamB1);
        assistTeamA = savedInstanceState.getInt(assistTeamA1);
        reboundTeamA = savedInstanceState.getInt(reboundTeamA1);
        foulTeamA = savedInstanceState.getInt(foulTeamA1);
        assistTeamB = savedInstanceState.getInt(assistTeamB1);
        reboundTeamB = savedInstanceState.getInt(reboundTeamB1);
        foulTeamB = savedInstanceState.getInt(foulTeamB1);
        point3TotalA = savedInstanceState.getInt(point3TotalA1);
        point2TotalA = savedInstanceState.getInt(point2TotalA1);
        point1TotalA = savedInstanceState.getInt(point1TotalA1);
        point3TotalB = savedInstanceState.getInt(point3TotalB1);
        point2TotalB = savedInstanceState.getInt(point2TotalB1);
        point1TotalB = savedInstanceState.getInt(point1TotalB1);
    }

    @Override
    public void onPause() {
        super.onPause();
        setContentView(R.layout.activity_court_counter);
        displayForTeamA(scoreTeamA);
        display3ForTeamA(point3TotalA);
        display2ForTeamA(point2TotalA);
        display1ForTeamA(point1TotalA);
        displayAssistForTeamA(assistTeamA);
        displayReboundForTeamA(reboundTeamA);
        displayFoulForTeamA(foulTeamA);
        displayForTeamB(scoreTeamB);
        display3ForTeamB(point3TotalB);
        display2ForTeamB(point2TotalB);
        display1ForTeamB(point1TotalB);
        displayAssistForTeamB(assistTeamB);
        displayReboundForTeamB(reboundTeamB);
        displayFoulForTeamB(foulTeamB);
    }

    @Override
    public void onResume() {
        super.onResume();
        setContentView(R.layout.activity_court_counter);
        displayForTeamA(scoreTeamA);
        display3ForTeamA(point3TotalA);
        display2ForTeamA(point2TotalA);
        display1ForTeamA(point1TotalA);
        displayAssistForTeamA(assistTeamA);
        displayReboundForTeamA(reboundTeamA);
        displayFoulForTeamA(foulTeamA);
        displayForTeamB(scoreTeamB);
        display3ForTeamB(point3TotalB);
        display2ForTeamB(point2TotalB);
        display1ForTeamB(point1TotalB);
        displayAssistForTeamB(assistTeamB);
        displayReboundForTeamB(reboundTeamB);
        displayFoulForTeamB(foulTeamB);
    }


//    Displays the given score for Team A.
//    Displays statistics for 3 point throws, 2 point throws and free throws for Team A.
//    Displays the total amount of assists, rebounds and fouls for TeamA

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void display1ForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_1);
        scoreView.setText(String.valueOf(score));
    }

    public void display2ForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_2);
        scoreView.setText(String.valueOf(score));
    }

    public void display3ForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_3);
        scoreView.setText(String.valueOf(score));
    }

    public void displayAssistForTeamA(int assist) {
        TextView assistView = findViewById(R.id.team_a_assist);
        assistView.setText(String.valueOf(assist));
    }

    public void displayReboundForTeamA(int rebound) {
        TextView reboundView = findViewById(R.id.team_a_rebound);
        reboundView.setText(String.valueOf(rebound));
    }

    public void displayFoulForTeamA(int foul) {
        TextView foulView = findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }


//    Calculating the total amount of Assists, Rebounds and Fouls for Team B

    public void assistForTeamA(View view) {
        assistTeamA = assistTeamA + 1;
        displayAssistForTeamA(assistTeamA);
    }

    public void reboundForTeamA(View view) {
        reboundTeamA = reboundTeamA + 1;
        displayReboundForTeamA(reboundTeamA);
    }


    public void foulForTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }


//    Adding three points to the total score for Team A.
//    Calculating the total number of three point shouts for Team A.

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
        point3TotalA = point3TotalA + 1;
        display3ForTeamA(point3TotalA);
    }


//    Adding two points to the total score for Team A.
//    Calculating the total number of two point shouts for Team A.

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
        point2TotalA = point2TotalA + 1;
        display2ForTeamA(point2TotalA);
    }


//    Adding one points to the total score for Team A.
//    Calculating the total number of one point shouts for Team A.

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        point1TotalA = point1TotalA + 1;
        display1ForTeamA(point1TotalA);
    }


//    Displays the given score for Team B.
//    Displays statistics for 3 point throws, 2 point throws and free throws for Team B.
//    Displays the total amount of assists, rebounds and fouls for TeamB.

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void display1ForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_1);
        scoreView.setText(String.valueOf(score));
    }

    public void display2ForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_2);
        scoreView.setText(String.valueOf(score));
    }

    public void display3ForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_3);
        scoreView.setText(String.valueOf(score));
    }

    public void displayAssistForTeamB(int assist) {
        TextView assistView = findViewById(R.id.team_b_assist);
        assistView.setText(String.valueOf(assist));
    }

    public void displayReboundForTeamB(int rebound) {
        TextView reboundView = findViewById(R.id.team_b_rebound);
        reboundView.setText(String.valueOf(rebound));
    }

    public void displayFoulForTeamB(int foul) {
        TextView foulView = findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }


//    Calculating the total amount of Assists, Rebounds and Fouls for Team B

    public void assistForTeamB(View view) {
        assistTeamB = assistTeamB + 1;
        displayAssistForTeamB(assistTeamB);
    }

    public void reboundForTeamB(View view) {
        reboundTeamB = reboundTeamB + 1;
        displayReboundForTeamB(reboundTeamB);
    }


    public void foulForTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }


//    Adding three points to the total score for Team B.
//    Calculating the total number of three point shouts for Team B.

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
        point3TotalB = point3TotalB + 1;
        display3ForTeamB(point3TotalB);
    }


//    Adding two points to the total score for Team B.
//    Calculating the total number of two point shouts for Team B.

    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
        point2TotalB = point2TotalB + 1;
        display2ForTeamB(point2TotalB);
    }


//    Adding one points to the total score for Team B.
//    Calculating the total number of one point shouts for Team B.

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        point1TotalB = point1TotalB + 1;
        display1ForTeamB(point1TotalB);
    }


//    Resets all the variables to their initial values.

    public void reset(View view) {
        displayForTeamA(0);
        display3ForTeamA(0);
        display2ForTeamA(0);
        display1ForTeamA(0);
        displayAssistForTeamA(0);
        displayReboundForTeamA(0);
        displayFoulForTeamA(0);
        displayForTeamB(0);
        display3ForTeamB(0);
        display2ForTeamB(0);
        display1ForTeamB(0);
        displayAssistForTeamB(0);
        displayReboundForTeamB(0);
        displayFoulForTeamB(0);
        scoreTeamA = 0;
        scoreTeamB = 0;
        assistTeamA = 0;
        reboundTeamA = 0;
        foulTeamA = 0;
        assistTeamB = 0;
        reboundTeamB = 0;
        foulTeamB = 0;
        point3TotalA = 0;
        point2TotalA = 0;
        point1TotalA = 0;
        point3TotalB = 0;
        point2TotalB = 0;
        point1TotalB = 0;
    }
}