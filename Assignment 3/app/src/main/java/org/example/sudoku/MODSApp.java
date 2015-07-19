/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
***/
package org.example.sudoku;

import android.app.Activity;  
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class MODSApp extends Activity implements OnClickListener {
    private static final String TAG = "MODSApp";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set up click listeners for all the buttons
        View triviaButton = findViewById(R.id.trivia_button);
        triviaButton.setOnClickListener(this);
        View animalButton = findViewById(R.id.animal_button);
        animalButton.setOnClickListener(this);
        View sealevelButton = findViewById(R.id.sealevel_button);
        sealevelButton.setOnClickListener(this);
        View fossilsButton = findViewById(R.id.fossils_button);
        fossilsButton.setOnClickListener(this);
    }
    // ...

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.trivia_button:
                Log.d(TAG, "clicked on Trivia button");

                Intent intent = new Intent();
                intent.setAction("com.triviagame");
                sendBroadcast(intent);
                break;
            // More buttons go here (if any) ...
            case R.id.animal_button:
                Log.d(TAG, "clicked on Prehistoric Animals button");
                Intent j = new Intent(this, PrehistoricAnimals.class);
                startActivity(j);
                break;
            case R.id.sealevel_button:
                Log.d(TAG, "clicked on Sealevel game button");
                Intent k = new Intent(this, SeaLevel.class);
                startActivity(k);
                break;
            case R.id.fossils_button:
                Log.d(TAG, "clicked on Fossils game button");
                Intent l = new Intent(this, Fossils.class);
                startActivity(l);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                startActivity(new Intent(this, Prefs.class));
                return true;
            // More items go here (if any) ...
        }
        return false;
    }

    /**
     * Ask the user what difficulty level they want
     */
    private void openNewGameDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.new_game_title)
                .setItems(R.array.difficulty,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialoginterface,
                                                int i) {
                                startGame(i);
                            }
                        })
                .show();
    }

    /**
     * Start a new game with the given difficulty level
     */
    private void startGame(int i) {
        Log.d(TAG, "clicked on " + i);
    }


    public void launch(View view) {

        Intent intent = new Intent();
        intent.setAction("com.triviagame");
        sendBroadcast(intent);


    }
}
