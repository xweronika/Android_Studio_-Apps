package com.gunshippenguin.click;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int klik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
       ++klik;

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.format("Przycisk wciśnięto %s razy", klik));
    }
}