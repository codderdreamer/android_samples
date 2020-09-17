package com.example.a13_listview_calismasi_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class mesajAdapter extends BaseAdapter {

    List<mesajModel> list;
    Context context;

    public mesajAdapter(List<mesajModel> list, Context context) {
        this.list = list;
        this.context = context;
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

        View layout = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);

        ImageView img = layout.findViewById(R.id.kisiResmi);
        TextView kisiIsmi = layout.findViewById(R.id.kisiIsmi);
        TextView mesaj = layout.findViewById(R.id.mesaj);

        img.setImageResource(list.get(position).getResimId());
        kisiIsmi.setText(list.get(position).getKisi());
        mesaj.setText(list.get(position).getMesajIcerik());

        return layout;
    }
}
