package com.example.a20_mesaj_gonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListeDoldur();
        tanimla();

    }

    public void ListeDoldur()
    {
        list = new ArrayList<>();
        Model model1 = new Model("Murat", "00000000000");
        Model model2 = new Model("Sevda", "05422662654");
        Model model3 = new Model("Ege", "22222222222");
        Model model4 = new Model("Aleyna", "33333333333");
        Model model5 = new Model("Büşra", "44444444444");

        list.add(model1);
        list.add(model2);
        list.add(model3);
        list.add(model4);
        list.add(model5);
    }

    public void tanimla()
    {
        ListView listView = findViewById(R.id.mesajList);
        Adapter adapter = new Adapter(list,this,this);
        listView.setAdapter(adapter);
    }
}