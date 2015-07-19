package org.example.sudoku.animals;

/**
 * Created by Marcus on 7/11/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import org.example.sudoku.MODSApp;
import org.example.sudoku.R;

public class p_sabertoothedcat extends Activity implements OnClickListener {
    private static final String TAG = "MODSApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_sabertoothedcat);

        //next animal
        View nextAnimalButton = findViewById(R.id.next_animal);
        nextAnimalButton.setOnClickListener(this);

        View homeButton = findViewById(R.id.home);
        homeButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next_animal:
                Log.d(TAG, "clicked on next animal button");
                Intent i = new Intent(this, p_phorusrhacidae.class);
                startActivity(i);
                break;
            case R.id.home:
                Log.d(TAG, "clicked on home button");
                Intent j = new Intent(this, MODSApp.class);
                startActivity(j);
                break;
        }
    }
}