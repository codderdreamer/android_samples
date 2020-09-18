package com.example.a16_activity_yasam_dongusu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Takip", "OnStart Metodu Çalıştı");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Takip","OnCreate Metodu Çalıştı");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Takip","OnResume Metodu Çalıştı");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Takip","OnPause Methodu Çalıştı");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Takip","OnRestart Methodu Çalıştı");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Takip","OnDestroy Methodu Çalıştı");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Takip","OnStop Methodu Çalıştı");
    }
}