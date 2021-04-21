package dev.barcelosluan.listajogos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import dev.barcelosluan.listajogos.R;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button botaoAdd;
    EditText entradaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        botaoAdd = findViewById(R.id.botaoAdd);
        entradaUsuario = findViewById(R.id.editTextEntradaUsuario);


        ArrayList <String> listaJogos = new ArrayList<>();

        botaoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listaJogos.add(entradaUsuario.getText().toString());
                closeKeyboard();
            }
        });

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, listaJogos);

        listView.setAdapter(adaptador);
    }

    private void closeKeyboard() {
        View view = this.getCurrentFocus();

        if (view != null) {
            InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}