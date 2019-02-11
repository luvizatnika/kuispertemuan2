package com.luvizatnika1501512.utsmobprog.mytoolbar;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolderEleraning extends RecyclerView.ViewHolder {

    TextView tvNim, tvNama;

    public ViewHolderEleraning(@NonNull View itemView) {
        super(itemView);
        tvNim = (TextView) itemView.findViewById(R.id.nim);
        tvNama = (TextView) itemView.findViewById(R.id.nama);

    }
}
