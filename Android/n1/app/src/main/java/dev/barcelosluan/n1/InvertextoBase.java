package dev.barcelosluan.n1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class InvertextoBase extends AppCompatActivity {

    EditText editTexto;
    Button btnInverter;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invertexto_base);

        editTexto = findViewById(R.id.edit_invertexto_base_texto);
        btnInverter = findViewById(R.id.btn_invertexto_base_inverter);
        btnVoltar = findViewById(R.id.btn_invertexto_base_voltar);

        btnInverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = editTexto.getText().toString();

                AlertDialog alert = new AlertDialog.Builder(InvertextoBase.this).create();

                closeKeyboard();

                if (texto.isEmpty()) {
                    alert.setMessage("Digite um texto para inverter...");
                    alert.show();
                } else {
                    Intent i = new Intent(InvertextoBase.this, InvertextoResultado.class);
                    Bundle extras = new Bundle();

                    extras.putString("textoBase", texto);
                    i.putExtras(extras);

                    startActivity(i);
                }

            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InvertextoBase.this, Indice.class);
                startActivity(i);
            }
        });

    }

    private void closeKeyboard() {
        View view = this.getCurrentFocus();

        if (view != null) {
            InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}
