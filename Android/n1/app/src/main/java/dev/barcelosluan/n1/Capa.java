package dev.barcelosluan.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Capa extends AppCompatActivity {

    Button btnIndice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capa);

        btnIndice = findViewById(R.id.btn_capa_atividade);

        btnIndice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Capa.this, Indice.class);
                startActivity(i);
            }
        });

    }
}