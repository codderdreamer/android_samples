package com.example.a19_activityler_arasi_gecis_2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class AdapterModel extends BaseAdapter {

    List<Model> list;
    Context context;
    Activity activity;

    public AdapterModel(List<Model> list, Context context, Activity activity ) {
        this.list = list;
        this.context = context;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        TextView isim = convertView.findViewById(R.id.isim);
        TextView soyisim = convertView.findViewById(R.id.soyisim);
        TextView telno = convertView.findViewById(R.id.telno);
        LinearLayout linearLayout = convertView.findViewById(R.id.anaLayout);

        final String isimS = list.get(position).getIsim();
        final String soyisimS = list.get(position).getSoyisim();
        final String telNoS = list.get(position).getNumara();

        isim.setText(isimS);
        soyisim.setText(soyisimS);
        telno.setText(telNoS);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainActivity2.class);
                intent.putExtra("isim",isimS);
                intent.putExtra("telno", telNoS);
                intent.putExtra("soyisim",soyisimS);

                activity.startActivity(intent);
            }
        });

        return convertView;
    }
}
