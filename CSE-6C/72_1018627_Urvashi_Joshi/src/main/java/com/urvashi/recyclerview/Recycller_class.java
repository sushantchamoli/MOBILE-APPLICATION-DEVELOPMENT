package com.urvashi.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Recycller_class  extends RecyclerView.Adapter<Recycller_class.ViewHolder> {
    String data[];
    Context context;

    public Recycller_class(Context context, String[] data ){
        this.data=data;
        this.context=context;
    }
    @NonNull
    @Override
    public Recycller_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //used flatter here
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycler_design,parent, false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull Recycller_class.ViewHolder holder, int position) {

        holder.textView.setText(data[position]);
        holder.textView.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View v){
            Toast.makeText(context,"Clicked on "+data[position], Toast.LENGTH_SHORT).show();

        }

    });
    }

    @Override
    public int getItemCount() {
//providing datalength
        return data.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(@NonNull View itemView)
        {

            super(itemView);
            textView=itemView.findViewById(R.id.textNames);
        }
    }
}


