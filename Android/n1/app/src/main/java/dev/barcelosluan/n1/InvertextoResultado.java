package dev.barcelosluan.n1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InvertextoResultado  extends AppCompatActivity {

    TextView txtResultado;
    Button btnInverterOutro;
    Button btnVoltar;

    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invertexto_resultado);

        String textoBase;
        String textoReverso;
        StringBuilder sb;

        Intent intent = getIntent();
        extras = intent.getExtras();

        textoBase = extras.getString("textoBase");
        sb = new StringBuilder(textoBase);
        textoReverso = sb.reverse().toString();

        txtResultado = findViewById(R.id.txt_invertexto_resultado_resultado);
        btnInverterOutro = findViewById(R.id.btn_invertexto_resultado_outro);
        btnVoltar = findViewById(R.id.btn_invertexto_resultado_voltar);

        txtResultado.setText(textoReverso);

        btnInverterOutro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InvertextoResultado.this, InvertextoBase.class);
                startActivity(i);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(InvertextoResultado.this, Indice.class);
                    startActivity(i);
                }
            });
    }

}
