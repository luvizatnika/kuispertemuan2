package com.luvizatnika1501512.utsmobprog.mytoolbar;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AdapterElearning extends RecyclerView.Adapter<ViewHolderEleraning> {

    ArrayList<Elearning> alElearning;

    public AdapterElearning (ArrayList<Elearning> alElearning){
        this.alElearning = alElearning;
    }

    @NonNull
    @Override
    public ViewHolderEleraning onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new ViewHolderEleraning(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderEleraning holder, int position) {
        Elearning e = alElearning.get(position);
        holder.tvNim.setText(e.getNim());
        holder.tvNama.setText(e.getNama());
    }

    @Override
    public int getItemCount() {
        return alElearning.size();
    }
}
