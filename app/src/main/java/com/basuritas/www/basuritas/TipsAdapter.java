package com.basuritas.www.basuritas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by globalstudent on 13-08-15.
 */
public class TipsAdapter extends ArrayAdapter<Tip> {
    public TipsAdapter(Context context, int resource, List<Tip> objects) {
        super(context, resource, objects);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = LayoutInflater.from(getContext()).inflate(R.layout.tip, parent, false);
        Tip tip = getItem(position);
        TextView textViewTitulo = (TextView) itemView.findViewById(R.id.titulo);
        textViewTitulo.setText(tip.titulo);
        TextView textViewContenido = (TextView) itemView.findViewById(R.id.contenido);
        textViewContenido.setText(tip.contenido);
        return itemView;
    }
}