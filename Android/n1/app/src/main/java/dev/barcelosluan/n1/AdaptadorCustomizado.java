package dev.barcelosluan.n1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorCustomizado extends ArrayAdapter<Evento> {
    private Context context;
    private int resourceList;


    public AdaptadorCustomizado(@NonNull Context context, int resource, @NonNull ArrayList<Evento> object) {
        super(context, resource, object);
        this.context = context;
        this.resourceList = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String nome = getItem(position).getNome();
        String data = getItem(position).getData();
        int id = getItem(position).getId();

        Evento evento = new Evento(nome, data, id);

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resourceList, parent, false);

        TextView tvNome = convertView.findViewById(R.id.registra_evento_lista_nome);
        TextView tvId = convertView.findViewById(R.id.registra_evento_lista_id);
        TextView tvData = convertView.findViewById(R.id.registra_evento_lista_data);

        tvNome.setText("" + nome + "");
        tvId.setText("" + id + "");
        tvData.setText("" + data + "");

        return convertView;
    }

}