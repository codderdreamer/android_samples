package com.example.a19_activityler_arasi_gecis_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> list;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listeOlustur();
        gec();
    }

    public void listeOlustur()
    {
        list = new ArrayList<>();
        Model m1 = new Model("Sevda", "Yücedağ", "0000");
        Model m2 = new Model("Murat", "Taş","1111");
        Model m3 = new Model("Serkan", "Koca","2222");
        Model m4 = new Model("Büsra", "Özkaya","3333");
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
    }

    public void gec()
    {
        listView = findViewById(R.id.list_view);
        AdapterModel adapterModel = new AdapterModel(list,this,this);
        listView.setAdapter(adapterModel);
    }
}