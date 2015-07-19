package org.example.sudoku;

/**
 * Created by Marcus on 7/10/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import org.example.sudoku.FossilsMoreInfo;

import android.view.View.OnClickListener;

public class Fossils extends Activity implements OnClickListener {
    private static final String TAG = "MODSApp";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fossils);

        //More Info Button
        View moreInfoButton = findViewById(R.id.moreinfo);
        moreInfoButton.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.moreinfo:
                Log.d(TAG, "clicked on next animal button");
                Intent i = new Intent(this, FossilsMoreInfo.class);
                startActivity(i);
                break;
        }
    }
}

