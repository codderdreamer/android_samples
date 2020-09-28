package com.example.a22_mail_gonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText icerik;
    EditText konu;
    EditText mailAdres;
    Button gonder;
    String icerikText, konuText, mailadresText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        mailUygulamalariniGorveGonder();

    }

    public void tanimla() {
        icerik = findViewById(R.id.editTextMailIcerik);
        konu = findViewById(R.id.editTextMailKonu);
        mailAdres = findViewById(R.id.editTextMailAdres);
        gonder = findViewById(R.id.buttonGonder);
    }

    public void bilgiAl() {
        icerikText = icerik.getText().toString();
        konuText = konu.getText().toString();
        mailadresText = mailAdres.getText().toString();
    }

    public void mailUygulamalariniGorveGonder() {
        gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bilgiAl();

                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("message/rfc822");
                    intent.putExtra(Intent.EXTRA_EMAIL, mailadresText);
                    intent.putExtra(Intent.EXTRA_SUBJECT, konuText);
                    intent.putExtra(Intent.EXTRA_TEXT, icerikText);
                    startActivity(Intent.createChooser(intent,"Mail Gönderinizzz"));
                } catch (Exception e) {
                    System.out.print("" + e);
                }


            }
        });
    }

}