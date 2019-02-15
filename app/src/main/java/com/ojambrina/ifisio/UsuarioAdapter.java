package com.ojambrina.ifisio;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder> {

    private List<Usuario> usuarioList;
    private LayoutInflater inflater;
    private OnClickListener handler;

    public UsuarioAdapter(Context context, List<Usuario> usuarioList, OnClickListener handler) {
        inflater = LayoutInflater.from(context);
        this.usuarioList = usuarioList;
        this.handler = handler;
    }

    class UsuarioViewHolder extends RecyclerView.ViewHolder {
        public final ImageView client_defaultImg;
        public final TextView clientName;

        public UsuarioViewHolder(View itemView) {
            super(itemView);
            client_defaultImg = itemView.findViewById(R.id.client_defaultImg);
            client_defaultImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    handler.onClick(usuarioList.get(getAdapterPosition()));
                }
            });
            clientName = itemView.findViewById(R.id.client_name);
        }
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = inflater.inflate(R.layout.cliente_item, viewGroup, false);
        return new UsuarioViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder usuarioViewHolder, int position) {
        Usuario usuario = usuarioList.get(position);

        String clientName = usuario.getNombre()+" "+usuario.getApellido1();

        usuarioViewHolder.clientName.setText(clientName);
    }

    @Override
    public int getItemCount() {
        if (usuarioList == null) {
            return 0;
        }
        return usuarioList.size();
    }

    public void setData(List<Usuario> newList) {
        usuarioList = newList;
        notifyDataSetChanged();
    }

    interface OnClickListener {
        void onClick(Usuario user);
    }
}
