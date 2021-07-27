package com.example.metertokilometer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static java.lang.Math.abs;

public class MainActivity extends AppCompatActivity {

    EditText val1, val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1=(EditText) findViewById(R.id.text);
        val2=(EditText) findViewById(R.id.ans);
    }

    public void Calculate(View v)
    {
        Intent it = new Intent(MainActivity.this, result.class);
        double a=Double.parseDouble(val1.getText().toString());
        double b=Double.parseDouble(val2.getText().toString());
        double km=abs(a-b)/1000.0;
        it.putExtra("ans", km);
        startActivity(it);
    }
}