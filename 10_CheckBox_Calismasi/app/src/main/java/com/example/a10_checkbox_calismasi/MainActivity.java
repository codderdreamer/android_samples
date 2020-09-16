package com.example.a10_checkbox_calismasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox phpCB;
    CheckBox javaCB;
    CheckBox pythonCB;
    CheckBox csharpCB;
    CheckBox cCB;
    CheckBox cplusplusCB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        mesajVer();

    }

    private void tanimla() {
        phpCB = findViewById(R.id.php);
        javaCB = findViewById(R.id.java);
        pythonCB = findViewById(R.id.python);
        csharpCB = findViewById(R.id.csharp);
        cCB = findViewById(R.id.c);
        cplusplusCB = findViewById(R.id.cplusplus);
    }

    private void mesajVer() {
        
        phpCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (phpCB.isChecked()) {
                    Toast.makeText(getApplicationContext(), phpCB.getText() + " tiklandi.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), phpCB.getText() + " iptal edildi.", Toast.LENGTH_LONG).show();
                }
            }
        });

        javaCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (javaCB.isChecked()) {
                    Toast.makeText(getApplicationContext(), javaCB.getText() + " tıklandı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), javaCB.getText() + " iptal edildi.", Toast.LENGTH_LONG).show();
                }
            }
        });

        pythonCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pythonCB.isChecked()) {
                    Toast.makeText(getApplicationContext(), pythonCB.getText() + " tıklandı.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), pythonCB.getText() + " iptal edildi.", Toast.LENGTH_LONG).show();
                }
            }
        });

        csharpCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (csharpCB.isChecked()) {
                    Toast.makeText(getApplicationContext(), csharpCB.getText() + " tiklandi.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), csharpCB.getText() + " iptal edildi.", Toast.LENGTH_LONG).show();
                }
            }
        });

        cCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cCB.isChecked()) {
                    Toast.makeText(getApplicationContext(), cCB.getText() + " tiklandi.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), cCB.getText() + " iptal edildi.", Toast.LENGTH_LONG).show();
                }
            }
        });

        cplusplusCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cplusplusCB.isChecked()) {
                    Toast.makeText(getApplicationContext(), cplusplusCB.getText() + " tiklandi.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), cplusplusCB.getText() + " iptal edildi.", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

}