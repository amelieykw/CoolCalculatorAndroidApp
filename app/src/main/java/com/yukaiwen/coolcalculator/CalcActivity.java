package com.yukaiwen.coolcalculator;

import android.app.Activity; // standard activity theme
import android.os.Bundle;

public class CalcActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
    }
}
