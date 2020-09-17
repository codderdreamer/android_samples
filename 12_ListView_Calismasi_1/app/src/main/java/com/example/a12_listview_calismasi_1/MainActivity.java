package com.example.a12_listview_calismasi_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<KullaniciModel> kullaniciModelList;
    ListView listView;
    KullaniciListAdapter kullaniciListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        listeDoldur();
    }

    private void listeDoldur()
    {
        kullaniciModelList = new ArrayList<>();

        KullaniciModel kullaniciModel1 = new KullaniciModel("sevda", "27","yücedağ","x");
        KullaniciModel kullaniciModel2 = new KullaniciModel("hakan","27", "yildiz","y");
        KullaniciModel kullaniciModel3 = new KullaniciModel("büşra","18","koç","z");
        KullaniciModel kullaniciModel4 = new KullaniciModel("ali","20","al","k");

        kullaniciModelList.add(kullaniciModel1);
        kullaniciModelList.add(kullaniciModel2);
        kullaniciModelList.add(kullaniciModel3);
        kullaniciModelList.add(kullaniciModel4);

        kullaniciListAdapter = new KullaniciListAdapter(kullaniciModelList, this);
        listView.setAdapter(kullaniciListAdapter);

    }

    private void tanimla()
    {
        listView = findViewById(R.id.listView);
    }

}