package dev.barcelosluan.lervalores;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    Button btnNormal, btnCrescente, btnDecrescente;
    EditText valor01, valor02, valor03, valor04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNormal = findViewById(R.id.btnNormal);
        btnCrescente = findViewById(R.id.btnCrescente);
        btnDecrescente = findViewById(R.id.btnDecrescente);

        valor01 = findViewById(R.id.valor01);
        valor02 = findViewById(R.id.valor02);
        valor03 = findViewById(R.id.valor03);
        valor04 = findViewById(R.id.valor04);

        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listarNormal();
            }
        });

        btnCrescente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listarCrescente();
            }
        });

        btnDecrescente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listarDecrescente();
            }
        });
    }

    public boolean preenchido() {
        return valor01.getText().toString().isEmpty()
                || valor02.getText().toString().isEmpty()
                || valor03.getText().toString().isEmpty()
                || valor03.getText().toString().isEmpty();
    }

    public ArrayList<Integer> ordenar() {
        ArrayList<Integer> valores = new ArrayList<>();

        valores.add(Integer.parseInt(valor01.getText().toString()));
        valores.add(Integer.parseInt(valor02.getText().toString()));
        valores.add(Integer.parseInt(valor03.getText().toString()));
        valores.add(Integer.parseInt(valor04.getText().toString()));

        Collections.sort(valores);

        return valores;
    }

    public void listarNormal() {
        AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();
        alert.setTitle("Ordem Normal");

        if (preenchido()) {
            alert.setMessage("Preencha todos os valores!");
        } else {
            alert.setMessage("Valor 01: " + valor01.getText().toString() + "\n"
                    + "Valor 02: " +  valor02.getText().toString() + "\n"
                    + "Valor 03: " + valor03.getText().toString() + "\n"
                    + "Valor 04: " + valor04.getText().toString());
        }

        alert.show();
    }

    public void listarCrescente() {
        AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();
        alert.setTitle("Ordem Crescente");

        if (preenchido()) {
            alert.setMessage("Preencha todos os valores!");
        } else {
            ArrayList<Integer> valores = ordenar();

            alert.setMessage("Valor 01: " + valores.get(0) + "\n"
                    + "Valor 02: " +  valores.get(1) + "\n"
                    + "Valor 03: " + valores.get(2) + "\n"
                    + "Valor 04: " + valores.get(3));
        }

        alert.show();
    }

    public void listarDecrescente() {
        AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();
        alert.setTitle("Ordem Decrescente");

        if (preenchido()) {
            alert.setMessage("Preencha todos os valores!");
        } else {
            ArrayList<Integer> valores = ordenar();

            alert.setMessage("Valor 01: " + valores.get(3) + "\n"
                    + "Valor 02: " +  valores.get(2) + "\n"
                    + "Valor 03: " + valores.get(1) + "\n"
                    + "Valor 04: " + valores.get(0));
        }

        alert.show();
    }

}