package com.example.activityler_arasi_gecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        butonaBasinca();

    }

    public void tanimla()
    {
        button = findViewById(R.id.butonGecisYap);
    }

    public void butonaBasinca()
    {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecisYap();
            }
        });
    }

    public void gecisYap()
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

}