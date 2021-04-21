package dev.barcelosluan.n1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Jankenpon extends AppCompatActivity {

    ImageButton btnPedra;
    ImageButton btnPapel;
    ImageButton btnTesoura;
    ImageView imgJogador;
    ImageView imgMaquina;
    TextView txtPlacarJogador;
    TextView txtPlacarMaquina;
    Button btnZerarPlacar;
    Button btnVoltar;

    Random aleatorio = new Random();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jankenpon);

        btnPedra = findViewById(R.id.btn_jankenpon_pedra);
        btnPapel = findViewById(R.id.btn_jankenpon_papel);
        btnTesoura = findViewById(R.id.btn_jankenpon_tesoura);
        imgJogador = findViewById(R.id.img_jankenpon_jogador);
        imgMaquina = findViewById(R.id.img_jankenpon_maquina);
        txtPlacarJogador = findViewById(R.id.txt_jankenpon_placar_jogador);
        txtPlacarMaquina = findViewById(R.id.txt_jankenpon_placar_maquina);
        btnZerarPlacar = findViewById(R.id.btn_jankenpon_zerar);
        btnVoltar = findViewById(R.id.btn_jankenpon_voltar);

        btnPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultadoMaquina = jogadaMaquina();
                int placarJogador = Integer.parseInt(txtPlacarJogador.getText().toString());
                int placarMaquina = Integer.parseInt(txtPlacarMaquina.getText().toString());

                imgJogador.setImageResource(R.drawable.jankenpon_pedra);
                if (resultadoMaquina == 1) {
                    Toast.makeText(Jankenpon.this, "Empate!", Toast.LENGTH_SHORT).show();
                } else if (resultadoMaquina == 2) {
                    Toast.makeText(Jankenpon.this, "Perdeu!", Toast.LENGTH_SHORT).show();
                    txtPlacarMaquina.setText(String.valueOf(placarMaquina + 1));
                } else if (resultadoMaquina == 3) {
                    Toast.makeText(Jankenpon.this, "Ganhou!", Toast.LENGTH_SHORT).show();
                    txtPlacarJogador.setText(String.valueOf(placarJogador + 1));
                } else {
                    Toast.makeText(Jankenpon.this, "Pane no sistema alguem me desconfigurou", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultadoMaquina = jogadaMaquina();
                int placarJogador = Integer.parseInt(txtPlacarJogador.getText().toString());
                int placarMaquina = Integer.parseInt(txtPlacarMaquina.getText().toString());

                imgJogador.setImageResource(R.drawable.jankenpon_papel);
                if (resultadoMaquina == 1) {
                    Toast.makeText(Jankenpon.this, "Ganhou!", Toast.LENGTH_SHORT).show();
                    txtPlacarJogador.setText(String.valueOf(placarJogador + 1));
                } else if (resultadoMaquina == 2) {
                    Toast.makeText(Jankenpon.this, "Empate!", Toast.LENGTH_SHORT).show();
                } else if (resultadoMaquina == 3) {
                    Toast.makeText(Jankenpon.this, "Perdeu!", Toast.LENGTH_SHORT).show();
                    txtPlacarMaquina.setText(String.valueOf(placarMaquina + 1));
                } else {
                    Toast.makeText(Jankenpon.this, "Pane no sistema alguem me desconfigurou", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnTesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultadoMaquina = jogadaMaquina();
                int placarJogador = Integer.parseInt(txtPlacarJogador.getText().toString());
                int placarMaquina = Integer.parseInt(txtPlacarMaquina.getText().toString());

                imgJogador.setImageResource(R.drawable.jankenpon_tesoura);
                if (resultadoMaquina == 1) {
                    Toast.makeText(Jankenpon.this, "Perdeu!", Toast.LENGTH_SHORT).show();
                    txtPlacarMaquina.setText(String.valueOf(placarMaquina + 1));
                } else if (resultadoMaquina == 2) {
                    Toast.makeText(Jankenpon.this, "Ganhou!", Toast.LENGTH_SHORT).show();
                    txtPlacarJogador.setText(String.valueOf(placarJogador + 1));
                } else if (resultadoMaquina == 3) {
                    Toast.makeText(Jankenpon.this, "Empate!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Jankenpon.this, "Pane no sistema alguem me desconfigurou", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnZerarPlacar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPlacarJogador.setText("0");
                txtPlacarMaquina.setText("0");
                imgJogador.setImageResource(R.drawable.jankenpon);
                imgMaquina.setImageResource(R.drawable.jankenpon);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jankenpon.this, Indice.class);
                startActivity(i);
            }
        });

    }

    private int jogadaMaquina() {
        int resultadoMaquina = aleatorio.nextInt(3) + 1;

        if (resultadoMaquina == 1) {
            imgMaquina.setImageResource(R.drawable.jankenpon_pedra);
        } else if (resultadoMaquina == 2) {
            imgMaquina.setImageResource(R.drawable.jankenpon_papel);
        } else {
            imgMaquina.setImageResource(R.drawable.jankenpon_tesoura);
        }

        return resultadoMaquina;
    }

}
