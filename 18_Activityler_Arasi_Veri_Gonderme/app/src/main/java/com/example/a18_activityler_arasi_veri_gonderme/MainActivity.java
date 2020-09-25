package com.example.a18_activityler_arasi_veri_gonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText kullaniciAdiET, kullaniciSifresiET;
    Button button;
    RadioGroup radioGroup;

    String kullaniciAdi, kullaniciSifre, kullaniciCinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        tiklaveGec();
    }

    void tanimla() {
        kullaniciAdiET = findViewById(R.id.kullaniciAdi);
        kullaniciSifresiET = findViewById(R.id.kullaniciSifresi);
        button = findViewById(R.id.button);
        radioGroup = findViewById(R.id.radioGroup);
    }

    void degerAl() {
        kullaniciAdi = kullaniciAdiET.getText().toString();
        kullaniciSifre = kullaniciSifresiET.getText().toString();
        kullaniciCinsiyet = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
    }

    void tiklaveGec() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerAl();
                Log.i("Values", "Kullanıcı Adı: " + kullaniciAdi + " Kullanıcı Cinsiyeti: " + kullaniciCinsiyet + " Kullanıcı Sifre: " + kullaniciSifre);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("kullaniciAdi",kullaniciAdi);
                intent.putExtra("kullaniciSifre",kullaniciSifre);
                intent.putExtra("kullaniciCinsiyet", kullaniciCinsiyet);
                startActivity(intent);
            }
        });
    }
}