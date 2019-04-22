package com.ojambrina.ifisio;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class PerfilUsuarioAdapter extends RecyclerView.Adapter<PerfilUsuarioAdapter.PerfilUsuarioViewHolder> {
    @NonNull
    @Override
    public PerfilUsuarioAdapter.PerfilUsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PerfilUsuarioAdapter.PerfilUsuarioViewHolder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PerfilUsuarioViewHolder extends RecyclerView.ViewHolder {
        public PerfilUsuarioViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
