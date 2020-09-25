package com.example.activityler_arasi_gecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tanimla();
        butonaBasinca();
    }

    public void tanimla()
    {
        button = findViewById(R.id.button3);
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
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}