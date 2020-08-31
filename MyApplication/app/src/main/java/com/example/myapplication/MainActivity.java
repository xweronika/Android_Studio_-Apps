package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String tag = "zdarzenia";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onCreate()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,  "onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,  "onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,  "onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,  "onDestroy()");
    }
    public void onClick(View view){
        startActivity(new Intent( this, DrugaAktywnosc.class));
    }
    public void onClickButtonMisto(View view){
        EditText editText = (EditText) findViewById(R.id. miasto);
        String miasto = editText.getText().toString();

        Uri geoUri = Uri.parse("geo:0,0?q="+miasto);
        Intent intent = new Intent(Intent.ACTION_VIEW, geoUri);
        startActivity(intent);
    }

}