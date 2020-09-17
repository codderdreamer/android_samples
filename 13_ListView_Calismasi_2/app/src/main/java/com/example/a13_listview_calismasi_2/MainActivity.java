package com.example.a13_listview_calismasi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<mesajModel> list;
    mesajAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        listDoldur();

    }

    private void tanimla()
    {
        listView = findViewById(R.id.listView);
    }

    private void listDoldur()
    {
        list = new ArrayList<>();

        mesajModel mesajModel1 = new mesajModel("Selam nasilsin canim","Buse",R.drawable.buse);
        mesajModel mesajModel2 = new mesajModel("Bugün buluşuyor muyuz?","Zeynep",R.drawable.zeynep);
        mesajModel mesajModel3 = new mesajModel("Napiyosun?","Ahmet",R.drawable.ahmet);
        mesajModel mesajModel4 = new mesajModel("Eve gelirken ne alayim?","Seda",R.drawable.seda);

        list.add(mesajModel1);
        list.add(mesajModel2);
        list.add(mesajModel3);
        list.add(mesajModel4);

        adapter = new mesajAdapter(list,this);
        listView.setAdapter(adapter);
    }

}