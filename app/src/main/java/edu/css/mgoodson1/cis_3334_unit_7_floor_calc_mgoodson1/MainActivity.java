package edu.css.mgoodson1.cis_3334_unit_7_floor_calc_mgoodson1;

/**
 * Project: CIS 3334-700 - Unit 7: Assignment 7 - Flooring Activity
 * Developer: Matt Goodson
 * Verison: 2018-03-05
 *
 * App with two activities(screens) used to calculate the amount of flooring needed
 *
 * Main Activity used to enter the width and length
 *
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int CIS3334_REQUESTCODE = 1111;
    EditText textWidth;
    EditText textLength;
    TextView textArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textWidth = (EditText) findViewById(R.id.editTextWidth);
        textLength = (EditText) findViewById(R.id.editTextLength);
        textArea = (TextView) findViewById(R.id.textViewArea);

    }

    public void onClickShowResult(View view) {


        //Return error is Width not set
        if(TextUtils.isEmpty(textWidth.getText())) {
            textWidth.setError("Please set width");
            return;
        }
        //Return error is Length not set
        if(TextUtils.isEmpty(textLength.getText())) {
            textLength.setError("Please set length");
            return;
        }


        //Pass bundle to DisplayResultActivity
        Double width = Double.parseDouble(textWidth.getText().toString());
        Double length = Double.parseDouble(textLength.getText().toString());
        Intent showResultsActIntent = new Intent(this, DisplayResultActivity.class);
        showResultsActIntent.putExtra("Width", width);
        showResultsActIntent.putExtra("Length", length);
        startActivityForResult(showResultsActIntent, CIS3334_REQUESTCODE);
    }

    //Display result returned from DisplayResultActivity
    public void onActivityResult(int requestCode, int resultCode, Intent data ){
        if (resultCode == RESULT_OK && requestCode == CIS3334_REQUESTCODE) {
            if (data.hasExtra("Area")) {
                String result = data.getExtras().getString("Area");
                textArea.setText("Area Calc:" + result);
            }
        }
    }



}
