package com.example.a11_radiobuton_calismasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton resim1Radio;
    RadioButton resim2Radio;
    RadioButton resim3Radio;
    RadioButton resim4Radio;
    ImageView img;
    RadioGroup radioGroup;
    Button buton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        //islevVer();
        idAl();
    }

    private void tanimla() {
        resim1Radio = findViewById(R.id.resim1);
        resim2Radio = findViewById(R.id.resim2);
        resim3Radio = findViewById(R.id.resim3);
        resim4Radio = findViewById(R.id.resim4);
        img = findViewById(R.id.image);
        radioGroup = findViewById(R.id.radio);
        buton = findViewById(R.id.buton);
    }

    private void idAl() {
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int gelenId = radioGroup.getCheckedRadioButtonId();
                resimdegis(gelenId);
            }
        });


    }

    private void resimdegis(int id) {
        if (id == R.id.resim1) {
            img.setImageResource(R.drawable.bir);
            Toast.makeText(getApplicationContext(), resim1Radio.getText(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.resim2) {
            img.setImageResource(R.drawable.iki);
            Toast.makeText(getApplicationContext(), resim2Radio.getText(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.resim3) {
            img.setImageResource(R.drawable.uc);
            Toast.makeText(getApplicationContext(), resim3Radio.getText(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.resim4) {
            img.setImageResource(R.drawable.dort);
            Toast.makeText(getApplicationContext(), resim4Radio.getText(), Toast.LENGTH_LONG).show();
        }
    }

    private void islevVer() {
        resim1Radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.bir);
                Toast.makeText(getApplicationContext(), resim1Radio.getText(), Toast.LENGTH_LONG).show();
            }
        });

        resim2Radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.iki);
                Toast.makeText(getApplicationContext(), resim2Radio.getText(), Toast.LENGTH_LONG).show();
            }
        });

        resim3Radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.uc);
                Toast.makeText(getApplicationContext(), resim3Radio.getText(), Toast.LENGTH_LONG).show();
            }
        });

        resim4Radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.dort);
                Toast.makeText(getApplicationContext(), resim4Radio.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }


}