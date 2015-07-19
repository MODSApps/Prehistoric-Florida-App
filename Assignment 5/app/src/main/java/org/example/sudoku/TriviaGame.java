package org.example.sudoku;

/**
 * Created by Marcus on 7/10/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class TriviaGame extends Activity implements OnClickListener {
    private static final String TAG = "MODSApp";

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.triviagame);
        //trivia answer choices
        View answerChoice1 = findViewById(R.id.answer1);
        answerChoice1.setOnClickListener(this);
        View answerChoice2 = findViewById(R.id.answer2);
        answerChoice2.setOnClickListener(this);
        View answerChoice3 = findViewById(R.id.answer3);
        answerChoice3.setOnClickListener(this);
        View answerChoice4 = findViewById(R.id.answer4);
        answerChoice4.setOnClickListener(this);
    }

    public void onClick(View v) {
    }
}
