package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DrugaAktywnosc extends AppCompatActivity {

    int Kod = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_aktywnosc);
    }

    public void onClick2(View view){
       // startActivity(new Intent( this, TrzeciaAktywnosc.class));
        Intent i = new Intent(this, TrzeciaAktywnosc.class );
       // i.putExtra("imie", "Jan");
       // i.putExtra("wiek", 26);
        startActivityForResult(new Intent(this, TrzeciaAktywnosc.class), Kod);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       TextView tekst = (TextView) findViewById(R.id.tekst);
       if (requestCode == Kod){
            if (resultCode == RESULT_OK){
                String imie = data.getStringExtra("imie");
                String wiek = data.getStringExtra("wiek");

                tekst.setText("Jestem "+ imie + " i mam " + wiek + " lat.");
                Toast.makeText(this, "Witaj " + imie, Toast.LENGTH_SHORT).show();
            }
       }
    }
    public void onClick3(View view){
        startActivity(new Intent( this, MainActivity.class));
    }
}
