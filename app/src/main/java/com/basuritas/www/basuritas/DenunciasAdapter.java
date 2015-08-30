package com.basuritas.www.basuritas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by globalstudent on 18-08-15.
 */
public class DenunciasAdapter extends ArrayAdapter<Denuncia> {

        public DenunciasAdapter(Context context, int resource, List<Denuncia> objects) {
            super(context, resource, objects);
        }

    @Override
    public View getView(int position, View convertView,ViewGroup parent){
        View itemView = LayoutInflater.from(getContext()).inflate(R.layout.denuncia, parent, false);
        Denuncia denuncia = getItem(position);
        TextView textViewTitulo = (TextView) itemView.findViewById(R.id.titulo);
        textViewTitulo.setText(denuncia.titulo);
        TextView textViewContenido = (TextView) itemView.findViewById(R.id.contenido);
        textViewContenido.setText(denuncia.contenido);

        return convertView;
    }
}
