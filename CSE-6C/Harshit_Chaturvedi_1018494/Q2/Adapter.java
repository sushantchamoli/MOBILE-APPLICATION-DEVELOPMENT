package com.harshit.androidexam;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Map;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private Context aCtx;
    private List<Map<String, String>> list;

    public Adapter(Context aCtx, List<Map<String, String>> list){
        this.aCtx=aCtx;
        this.list=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(aCtx).inflate(R.layout.card_country, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(list.get(position).get("name"));


        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(aCtx, MainActivity2.class);
            intent.putExtra("country",list.get(position).get("name"));
            intent.putExtra("data",list.get(position).get("data"));
            intent.putExtra("img",list.get(position).get("img"));

            aCtx.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        if (list == null){
            return 0;
        }
        return list.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.text_country);

        }
    }


}



