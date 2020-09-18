package com.example.a14_recyclerview_calismasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<mesajModel> list;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    adapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        listeDoldur();

    }

    public  void tanimla()
    {
        recyclerView = findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    public void listeDoldur()
    {
        list = new ArrayList<>();
        mesajModel m1 = new mesajModel("Ahmet", "Selam", R.drawable.ahmet);
        mesajModel m2 = new mesajModel("Buse", "merhaba ben buse", R.drawable.buse);
        mesajModel m3 = new mesajModel("Seda", "Nasilsin?", R.drawable.seda);
        mesajModel m4 = new mesajModel("Zeynep", "hadi nerdesin?", R.drawable.zeynep);

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        adp = new adapter(this,list);
        recyclerView.setAdapter(adp);

    }



}