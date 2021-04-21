package dev.barcelosluan.n1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Indice extends AppCompatActivity {

    Button btnGeradorAleatorio;
    Button btnJankenpon;
    Button btnInvertexto;
    Button btnRegEvento;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indice);

        btnGeradorAleatorio = findViewById(R.id.btn_indice_gerador_aleatorio);
        btnJankenpon = findViewById(R.id.btn_indice_jankenpon);
        btnInvertexto = findViewById(R.id.btn_indice_invertexto);
        btnRegEvento = findViewById(R.id.btn_indice_registra_evento);

        btnGeradorAleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Indice.this, GeradorAleatorio.class);
                startActivity(i);
            }
        });

        btnJankenpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Indice.this, Jankenpon.class);
                startActivity(i);
            }
        });

        btnInvertexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Indice.this, InvertextoBase.class);
                startActivity(i);
            }
        });

        btnRegEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Indice.this, RegistraEventos.class);
                startActivity(i);
            }
        });

    }
}
