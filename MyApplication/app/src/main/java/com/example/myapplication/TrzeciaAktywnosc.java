package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TrzeciaAktywnosc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trzecia_aktywnosc);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String napis = bundle.getString("imie");
            int liczba = bundle.getInt("wiek");
            Toast.makeText(this, napis + " ma " + liczba + " lat ", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClick(View view) {
        Intent intent = new Intent();
        EditText imie = (EditText) findViewById(R.id.imie);
        intent.putExtra(  "imie", imie.getText().toString());

        EditText wiek = (EditText) findViewById(R.id.wiek);
        intent.putExtra(  "wiek", wiek.getText().toString());

        setResult(RESULT_OK, intent);
        finish();
    }
}