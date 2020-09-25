package com.example.a18_activityler_arasi_veri_gonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String kAdi, kSifre, kCinsiyet;
    TextView ad, cinsiyet, sifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tanimla();
        al();
    }

    public void tanimla()
    {
        ad = findViewById(R.id.ad);
        cinsiyet = findViewById(R.id.cinsiyet);
        sifre = findViewById(R.id.sifre);
    }

    public void al()
    {
        Bundle intent = getIntent().getExtras();
        kAdi = intent.getString("kullaniciAdi");
        kSifre = intent.getString("kullaniciSifre");
        kCinsiyet = intent.getString("kullaniciCinsiyet");
        Log.i("Values2","kAdi: " + kAdi + " kSifre: " + kSifre + " kCinsiyet: " + kCinsiyet);

        ad.setText(ad.getText() + kAdi);
        cinsiyet.setText(cinsiyet.getText() + kCinsiyet);
        sifre.setText(sifre.getText() + kSifre);
    }
}