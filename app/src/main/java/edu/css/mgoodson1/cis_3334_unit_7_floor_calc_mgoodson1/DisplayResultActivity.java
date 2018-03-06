package edu.css.mgoodson1.cis_3334_unit_7_floor_calc_mgoodson1;

/**
 * Project: CIS 3334-700 - Unit 7: Assignment 7 - Flooring Activity
 * Developer: Matt Goodson
 * Verison: 2018-03-05
 *
 * App with two activities(screens) used to calculate the amount of flooring needed
 *
 * Second Activity used to calculate and display the Area
 *
 * trying to sync
 *
 */


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayResultActivity extends AppCompatActivity {

    TextView tvArea;
    Double width;
    Double length;
    Double area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        tvArea = (TextView) findViewById(R.id.textViewArea);

        Bundle extras = getIntent().getExtras();
        width = extras.getDouble("Width");
        length = extras.getDouble("Length");

        area = width * length;
        tvArea.setText(area.toString());
    }

    public void finish(){
            Intent intent = new Intent();
            intent.putExtra("Area", area.toString());
            setResult(RESULT_OK, intent);
            super.finish();

    }

}
