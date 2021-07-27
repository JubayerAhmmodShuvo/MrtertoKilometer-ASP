package com.example.metertokilometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView show;
    double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        show = (TextView) show.findViewById();
        ans = getIntent().getExtras().getFloat("ans");

        show.setText(ans + "");
    }
}