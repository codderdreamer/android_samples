package com.example.a14_recyclerview_calismasi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.tanimla> {

    Context context;
    List<mesajModel> list;

    public adapter(Context context, List<mesajModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public adapter.tanimla onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        return new tanimla(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.tanimla holder, final int position) {
        holder.mesaj.setText(list.get(position).getMesaj());
        holder.img.setImageResource(list.get(position).getResimId());
        holder.kisi.setText(list.get(position).getIsim());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,list.get(position).getIsim(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class tanimla extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView kisi;
        TextView mesaj;

        public tanimla(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.resim);
            kisi = itemView.findViewById(R.id.kisi);
            mesaj = itemView.findViewById(R.id.mesaj);
        }
    }
}
