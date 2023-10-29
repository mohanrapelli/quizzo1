package com.example.work4.MyCustomAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.work4.R;
import com.example.work4.model.wwemodel;

import java.util.List;

public class mycustomadapter2 extends RecyclerView.Adapter<mycustomadapter2.wweviewholder> {
    List<wwemodel> wwemodelList;
    Context context;

    public mycustomadapter2(List<wwemodel> wwemodelList) {
        this.wwemodelList = wwemodelList;
        this.context=context;
    }

    @NonNull
    @Override
    public mycustomadapter2.wweviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout2,parent,false);
        return new wweviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter2.wweviewholder holder, int position) {
        wwemodel wwemodel=wwemodelList.get(position);
        holder.playername.setText(wwemodel.getPlayername());
        holder.playerimage.setImageResource(wwemodel.getPlayerimage());

    }

    @Override
    public int getItemCount() {
        return wwemodelList.size();
    }
    public static class wweviewholder extends RecyclerView.ViewHolder{
        TextView playername;
        ImageView playerimage;

        public wweviewholder(@NonNull View itemView) {
            super(itemView);
            playername=itemView.findViewById(R.id.name1);
            playerimage=itemView.findViewById(R.id.image1);
        }
    }
}
