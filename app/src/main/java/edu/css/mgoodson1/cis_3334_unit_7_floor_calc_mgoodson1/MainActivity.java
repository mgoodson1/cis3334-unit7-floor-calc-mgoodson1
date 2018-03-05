package edu.css.mgoodson1.cis_3334_unit_7_floor_calc_mgoodson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textWidth;
    EditText textLength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textWidth = (EditText) findViewById(R.id.editTextWidth);
        textLength = (EditText) findViewById(R.id.editTextLength);

    }

    public void onClickShowResult(View view) {
        Intent detailActIntent = new Intent(this,DisplayResultActivity.class);
        detailActIntent.putExtrac("displayResults", )
    }



}
