package com.example.a19_activityler_arasi_gecis_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tanimla();
        al();

    }

    public void tanimla()
    {
        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
        textView3 = findViewById(R.id.text3);
    }

    public void al()
    {
        Bundle bundle = getIntent().getExtras();
        String isim = bundle.getString("isim");
        String soyisim = bundle.getString("soyisim");
        String telno = bundle.getString("telno");

        textView1.setText(isim);
        textView2.setText(soyisim);
        textView3.setText(telno);

    }
}