package com.pulkitkumar.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;
    private RCOnItemClickListener rcL;

    public RvAdapter(Context context, String s1[], String s2[], int img[], RCOnItemClickListener listener) {
        this.context = context;
        this.data1 = s1;
        this.data2 = s2;
        this.images = img;
        this.rcL = listener;
    }


    @NonNull
    @NotNull
    @Override
    public RvAdapter.MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RvAdapter.MyViewHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.img.setImageResource(images[position]);
    }

    public interface  RCOnItemClickListener {
        void onClick(View v, int position);

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView t1,t2;
        ImageView img;
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.country_Title);
            t2 = itemView.findViewById(R.id.country_desc);
            img = itemView.findViewById(R.id.mapPic);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            rcL.onClick(v,getAdapterPosition());
        }
    }
}
