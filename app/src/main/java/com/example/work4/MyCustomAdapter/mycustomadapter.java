package com.example.work4.MyCustomAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.work4.R;
import com.example.work4.model.quizmodel;

import java.util.List;

public class mycustomadapter extends RecyclerView.Adapter<mycustomadapter.quizViewholder> {
    List<quizmodel> quizmodelList;

    public mycustomadapter(List<quizmodel> quizmodelList) {
        this.quizmodelList = quizmodelList;
    }

    @NonNull
    @Override
    public mycustomadapter.quizViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new quizViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter.quizViewholder holder, int position) {
        quizmodel quizmodel=quizmodelList.get(position);
        holder.contestname.setText(quizmodel.getContestname());
        holder.contestrating.setText(String.valueOf(quizmodel.getContestrating()));

    }

    @Override
    public int getItemCount() {
        return quizmodelList.size();
    }
    public static class quizViewholder extends RecyclerView.ViewHolder{
        TextView contestname,contestrating;

        public quizViewholder(@NonNull View itemView) {
            super(itemView);
            contestname=itemView.findViewById(R.id.name);
            contestrating=itemView.findViewById(R.id.rating);
        }
    }
}
